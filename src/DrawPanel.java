import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class DrawPanel extends JPanel {
    private int duckX = 0;
    private final LemmyDuck lemmyDuck;

    public DrawPanel() {
        lemmyDuck = new LemmyDuck(duckX, 80);

        getInputMap(WHEN_IN_FOCUSED_WINDOW).put(
                KeyStroke.getKeyStroke("SPACE"),
                "moveDuck"
        );

        getActionMap().put("moveDuck", new AbstractAction() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                duckX += 10;
                lemmyDuck.setX(duckX);
                repaint();
            }
        });
    }

    @Override
    public void paint(final Graphics gr) {
        super.paint(gr);
        lemmyDuck.draw(gr);
    }
}
