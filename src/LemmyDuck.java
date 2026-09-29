import java.awt.*;

public class LemmyDuck {

    private int x;
    private int y;

    public LemmyDuck(final int x, final int y) {
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    void draw(final Graphics gr) {
        Graphics2D g = (Graphics2D) gr;
        int left = x;
        int top = y;

        Polygon body = new Polygon(
                new int[]{
                        x + 25,
                        x + 90,
                        x + 225,
                        x + 360,
                        x + 440,
                        x + 460,
                        x + 400,
                        x + 275,
                        x + 125,
                        x + 40
                },
                new int[]{
                        y + 256,
                        y + 211,
                        y + 193,
                        y + 211,
                        y + 261,
                        y + 324,
                        y + 369,
                        y + 396,
                        y + 382,
                        y + 328
                },
                10
        );

        g.setColor(new Color(244, 190, 30));
        g.fillPolygon(body);
        g.setColor(Color.BLACK);
        g.drawPolygon(body);
        Polygon bodyLight = new Polygon(
                new int[]{
                        x + 90,
                        x + 225,
                        x + 360,
                        x + 440,
                        x + 350,
                        x + 210
                },
                new int[]{
                        y + 211,
                        y + 193,
                        y + 211,
                        y + 261,
                        y + 306,
                        y + 301
                },
                6
        );

        g.setColor(new Color(255, 215, 55));
        g.fillPolygon(bodyLight);
        g.setColor(Color.BLACK);
        g.drawPolygon(bodyLight);
        Polygon bodyShadow = new Polygon(
                new int[]{
                        x + 40,
                        x + 210,
                        x + 350,
                        x + 440,
                        x + 400,
                        x + 275,
                        x + 125
                },
                new int[]{
                        y + 328,
                        y + 301,
                        y + 306,
                        y + 261,
                        y + 369,
                        y + 396,
                        y + 382
                },
                7
        );

        g.setColor(new Color(218, 158, 25));
        g.fillPolygon(bodyShadow);
        g.setColor(Color.BLACK);
        g.drawPolygon(bodyShadow);

        Polygon tail = new Polygon(
                new int[]{
                        x + 90,
                        left,
                        x + 40,
                        x + 115
                },
                new int[]{
                        y + 234,
                        y + 189,
                        y + 301,
                        y + 288
                },
                4
        );

        g.setColor(new Color(255, 205, 35));
        g.fillPolygon(tail);
        g.setColor(Color.BLACK);
        g.drawPolygon(tail);
        Polygon tailLight = new Polygon(
                new int[]{
                        left,
                        x + 90,
                        x + 115,
                        x + 40
                },
                new int[]{
                        y + 189,
                        y + 234,
                        y + 288,
                        y + 256
                },
                4
        );

        g.setColor(new Color(255, 222, 65));
        g.fillPolygon(tailLight);
        g.setColor(Color.BLACK);
        g.drawPolygon(tailLight);

        Polygon head = new Polygon(
                new int[]{
                        x + 195,
                        x + 200,
                        x + 235,
                        x + 300,
                        x + 350,
                        x + 375,
                        x + 365,
                        x + 325,
                        x + 265,
                        x + 215
                },
                new int[]{
                        y + 175,
                        y + 103,
                        y + 67,
                        y + 63,
                        y + 90,
                        y + 139,
                        y + 189,
                        y + 225,
                        y + 229,
                        y + 211
                },
                10
        );

        g.setColor(new Color(255, 218, 55));
        g.fillPolygon(head);
        g.setColor(Color.BLACK);
        g.drawPolygon(head);
        Polygon headLight = new Polygon(
                new int[]{
                        x + 235,
                        x + 300,
                        x + 350,
                        x + 325,
                        x + 265
                },
                new int[]{
                        y + 67,
                        y + 63,
                        y + 90,
                        y + 153,
                        y + 162
                },
                5
        );

        g.setColor(new Color(255, 229, 85));
        g.fillPolygon(headLight);
        g.setColor(Color.BLACK);
        g.drawPolygon(headLight);
        Polygon headShadow = new Polygon(
                new int[]{
                        x + 195,
                        x + 200,
                        x + 235,
                        x + 265,
                        x + 215
                },
                new int[]{
                        y + 175,
                        y + 103,
                        y + 67,
                        y + 162,
                        y + 211
                },
                5
        );

        g.setColor(new Color(224, 175, 30));
        g.fillPolygon(headShadow);
        g.setColor(Color.BLACK);
        g.drawPolygon(headShadow);

        Polygon upperBeak = new Polygon(
                new int[]{
                        x + 340,
                        x + 400,
                        x + 460,
                        x + 405,
                        x + 345
                },
                new int[]{
                        y + 130,
                        y + 112,
                        y + 144,
                        y + 157,
                        y + 153
                },
                5
        );

        g.setColor(new Color(255, 150, 25));
        g.fillPolygon(upperBeak);
        g.setColor(Color.BLACK);
        g.drawPolygon(upperBeak);

        Polygon lowerBeak = new Polygon(
                new int[]{
                        x + 345,
                        x + 405,
                        x + 460,
                        x + 400,
                        x + 350
                },
                new int[]{
                        y + 153,
                        y + 157,
                        y + 144,
                        y + 180,
                        y + 180
                },
                5
        );

        g.setColor(new Color(225, 110, 20));
        g.fillPolygon(lowerBeak);
        g.setColor(Color.BLACK);
        g.drawPolygon(lowerBeak);

        Polygon hair = new Polygon(
                new int[]{
                        x + 200,
                        x + 225,
                        x + 240,
                        x + 225,
                        x + 195,
                        x + 180
                },
                new int[]{
                        y + 103,
                        y + 90,
                        y + 126,
                        y + 207,
                        y + 234,
                        y + 180
                },
                6
        );

        g.setColor(new Color(58, 43, 32));
        g.fillPolygon(hair);
        g.setColor(Color.BLACK);
        g.drawPolygon(hair);

        Polygon sideburn = new Polygon(
                new int[]{
                        x + 310,
                        x + 335,
                        x + 340,
                        x + 320,
                        x + 295
                },
                new int[]{
                        y + 139,
                        y + 148,
                        y + 207,
                        y + 225,
                        y + 180
                },
                5
        );

        g.setColor(new Color(52, 37, 27));
        g.fillPolygon(sideburn);
        g.setColor(Color.BLACK);
        g.drawPolygon(sideburn);

        int eyeSize = 22;

        g.setColor(Color.BLACK);
        g.fillOval(
                x + 310,
                y + 103,
                eyeSize,
                eyeSize
        );

        g.setColor(Color.WHITE);
        g.fillOval(
                x + 315,
                y + 105,
                7,
                7
        );

        Polygon hatTop = new Polygon(
                new int[]{
                        x + 180,
                        x + 215,
                        x + 305,
                        x + 335,
                        x + 320,
                        x + 195
                },
                new int[]{
                        y + 81,
                        top,
                        top,
                        y + 18,
                        y + 85,
                        y + 90
                },
                6
        );

        g.setColor(new Color(28, 28, 28));
        g.fillPolygon(hatTop);
        g.setColor(Color.BLACK);
        g.drawPolygon(hatTop);
        Polygon hatFacet = new Polygon(
                new int[]{
                        x + 215,
                        x + 270,
                        x + 305,
                        x + 320,
                        x + 265
                },
                new int[]{
                        top,
                        y + 4,
                        top,
                        y + 85,
                        y + 81
                },
                5
        );

        g.setColor(new Color(48, 48, 48));
        g.fillPolygon(hatFacet);
        g.setColor(Color.BLACK);
        g.drawPolygon(hatFacet);
        Polygon hatBrim = new Polygon(
                new int[]{
                        x + 155,
                        x + 200,
                        x + 320,
                        x + 415,
                        x + 395,
                        x + 315,
                        x + 205
                },
                new int[]{
                        y + 85,
                        y + 67,
                        y + 72,
                        y + 58,
                        y + 94,
                        y + 103,
                        y + 99
                },
                7
        );

        g.setColor(new Color(18, 18, 18));
        g.fillPolygon(hatBrim);
        g.setColor(Color.BLACK);
        g.drawPolygon(hatBrim);

        Polygon vest = new Polygon(
                new int[]{
                        x + 125,
                        x + 195,
                        x + 240,
                        x + 285,
                        x + 330,
                        x + 300,
                        x + 190,
                        x + 140
                },
                new int[]{
                        y + 234,
                        y + 211,
                        y + 229,
                        y + 270,
                        y + 328,
                        y + 360,
                        y + 351,
                        y + 306
                },
                8
        );

        g.setColor(new Color(32, 32, 32));
        g.fillPolygon(vest);
        g.setColor(Color.BLACK);
        g.drawPolygon(vest);
        Polygon lapel = new Polygon(
                new int[]{
                        x + 195,
                        x + 235,
                        x + 260,
                        x + 220
                },
                new int[]{
                        y + 211,
                        y + 234,
                        y + 288,
                        y + 274
                },
                4
        );

        g.setColor(new Color(65, 65, 65));
        g.fillPolygon(lapel);
        g.setColor(Color.BLACK);
        g.drawPolygon(lapel);
        int buttonSize = 12;

        g.setColor(Color.LIGHT_GRAY);
        g.fillOval(
                x + 265,
                y + 270,
                buttonSize,
                buttonSize
        );

        g.setColor(Color.BLACK);
        g.drawOval(
                x + 265,
                y + 270,
                buttonSize,
                buttonSize
        );

        g.setColor(Color.WHITE);

        int fontSize = 17;
        g.setFont(new Font("Serif", Font.BOLD, fontSize));

        g.drawString(
                "MOTÖRHEAD",
                x + 180,
                y + 324
        );
    }
}
