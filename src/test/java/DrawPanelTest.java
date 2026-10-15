import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import javax.swing.Action;
import javax.swing.SwingUtilities;
import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.lang.reflect.InvocationTargetException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

class DrawPanelTest {

    private DrawPanel panel;

    @BeforeEach
    void setUp() throws InvocationTargetException, InterruptedException {
        // Swing создаётся в отдельном потоке
        SwingUtilities.invokeAndWait(() -> panel = new DrawPanel());
    }

    @Test
    @DisplayName("Панель создаётся и содержит утку")
    void panelCreatesDuck() {
        assertNotNull(panel);
        assertNotNull(panel.getLemmyDuck());
    }

    @Test
    @DisplayName("Таймер сначала остановлен")
    void timerIsInitiallyStopped() {
        assertFalse(panel.getTimer().isRunning());
    }

    @Test
    @DisplayName("Пробел запускает прыжок")
    void spaceStartsJump() {
        Action jump = panel.getActionMap().get("jumpDuck");

        assertNotNull(jump);
        jump.actionPerformed(new ActionEvent(
                panel, ActionEvent.ACTION_PERFORMED, "jump"
        ));

        assertTrue(panel.getTimer().isRunning());
        panel.getTimer().stop();
    }

    @Test
    @DisplayName("Первый тик поднимает утку")
    void firstTickMovesDuckUp() {
        Timer timer = panel.getTimer();
        panel.actionPerformed(new ActionEvent(
                timer, ActionEvent.ACTION_PERFORMED, "tick"
        ));

        assertEquals(70, panel.getLemmyDuck().getY());
    }

    @Test
    @DisplayName("После прыжка утка возвращается назад")
    void duckReturnsAfterJump() {
        Timer timer = panel.getTimer();

        for (int i = 0; i < 12; i++) {
            panel.actionPerformed(new ActionEvent(
                    timer, ActionEvent.ACTION_PERFORMED, "tick"
            ));
        }

        assertEquals(80, panel.getLemmyDuck().getY());
        assertFalse(timer.isRunning());
    }

    @Test
    @DisplayName("Чужое событие игнорируется")
    void foreignEventIsIgnored() {
        panel.actionPerformed(new ActionEvent(
                new Object(), ActionEvent.ACTION_PERFORMED, "tick"
        ));

        assertEquals(80, panel.getLemmyDuck().getY());
    }
}
