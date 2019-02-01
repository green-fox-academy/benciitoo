package sierpinskycarpet;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangles {

    public static void mainDraw(Graphics graphics) {
        drawFractalTriangle (graphics,0, 0, WIDTH, 0, WIDTH/2, 865, 8);
    }
    public static void drawFractalTriangle(Graphics graphics, int x1, int y1, int x2, int y2, int x3, int y3, int depth) {
        if (depth == 0) {
            return;
        } else {
            graphics.drawLine(x1, y1, x2, y2);
            graphics.drawLine(x2, y2, x3, y3);
            graphics.drawLine(x3, y3, x1, y1);

            depth--;
            drawFractalTriangle(graphics, x1, y1, (x1 + x2)/2, (y1 + y2)/2, (x1 + x3)/2, (y1 + y3)/2, depth);
            drawFractalTriangle(graphics, (x1 + x2)/2, (y1 + y2)/2, x2, y2, (x2 + x3)/2, (y2 + y3)/2, depth);
            drawFractalTriangle(graphics,(x1 + x3)/2, (y1 + y3)/2, (x2 + x3)/2, (y2 + y3)/2, x3, y3, depth);
        }
    }

    // Don't touch the code below
    static int WIDTH = 999;
    static int HEIGHT = 999;
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setSize(new Dimension(WIDTH, HEIGHT));
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jFrame.add(new ImagePanel());
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}