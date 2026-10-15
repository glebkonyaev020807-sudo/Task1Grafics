import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class LemmyDuckTest {

    private LemmyDuck lemmyDuck;

    @BeforeEach
    void setUp() {
        lemmyDuck = new LemmyDuck(100, 80);
    }

    @Test
    @DisplayName("Начальные координаты сохраняются")
    void initialCoordinatesAreStored() {
        assertEquals(100, lemmyDuck.getX());
        assertEquals(80, lemmyDuck.getY());
    }

    @Test
    @DisplayName("setX изменяет координату X")
    void setXChangesCoordinate() {
        lemmyDuck.setX(150);
        assertEquals(150, lemmyDuck.getX());
    }

    @Test
    @DisplayName("setY изменяет координату Y")
    void setYChangesCoordinate() {
        lemmyDuck.setY(40);
        assertEquals(40, lemmyDuck.getY());
    }

    @Test
    @DisplayName("draw не выбрасывает исключений")
    void drawDoesNotThrow() {
        BufferedImage image = new BufferedImage(
                800, 600, BufferedImage.TYPE_INT_ARGB
        );
        Graphics2D g = image.createGraphics();

        assertDoesNotThrow(() -> lemmyDuck.draw(g));
        g.dispose();
    }

    @Test
    @DisplayName("draw рисует непрозрачные пиксели")
    void drawProducesOpaquePixels() {
        BufferedImage image = new BufferedImage(
                800, 600, BufferedImage.TYPE_INT_ARGB
        );
        Graphics2D g = image.createGraphics();
        lemmyDuck.draw(g);
        g.dispose();

        assertTrue(hasOpaquePixel(image));
    }

    private boolean hasOpaquePixel(final BufferedImage image) {
        for (int x = 0; x < image.getWidth(); x++) {
            for (int y = 0; y < image.getHeight(); y++) {
                if ((image.getRGB(x, y) >>> 24) != 0) {
                    return true;
                }
            }
        }
        return false;
    }
}
