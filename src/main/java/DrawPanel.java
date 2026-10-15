import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DrawPanel extends JPanel implements ActionListener {
    // Таймер анимации
    private final Timer timer;
    private final LemmyDuck lemmyDuck;
    // Текущая высота утки
    private int duckY = 80;
    private boolean goingUp = true;

    public DrawPanel() {
        lemmyDuck = new LemmyDuck(0, duckY);
        timer = new Timer(30, this);

        // Привязка прыжка к пробелу
        getInputMap(WHEN_IN_FOCUSED_WINDOW).put(
                KeyStroke.getKeyStroke("SPACE"),
                "jumpDuck"
        );

        getActionMap().put("jumpDuck", new AbstractAction() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                // Начало прыжка
                if (!timer.isRunning()) {
                    goingUp = true;
                    timer.start();
                }
            }
        });
    }

    public Timer getTimer() {
        return this.timer;
    }

    public LemmyDuck getLemmyDuck() {
        return this.lemmyDuck;
    }

    @Override
    public void actionPerformed(final ActionEvent e) {
        if (e.getSource() != timer) {
            return;
        }

        // Подъём и опускание утки
        if (goingUp) {
            duckY -= 10;

            if (duckY <= 20) {
                // Утка начинает опускаться
                goingUp = false;
            }
        } else {
            duckY += 10;

            if (duckY >= 80) {
                duckY = 80;
                // Прыжок закончен
                timer.stop();
            }
        }

        // Передача новой координаты
        lemmyDuck.setY(duckY);
        repaint();
    }

    @Override
    public void paint(final Graphics gr) {
        // Отрисовка панели и утки
        super.paint(gr);
        lemmyDuck.draw(gr);
    }
}
