import javafx.scene.layout.BackgroundFill;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class EnvelopeStar {
    public static void mainDraw(Graphics graphics) {
        // Fill the canvas with a checkerboard pattern.

        int center = WIDTH / 2;
        int space = (WIDTH / 2) / 16;
        int pos = 0;
        graphics.setColor(Color.green);

        for (int i = 0; i < 16; i++) {
            DrawLine(pos, center, center, center + pos + 10, graphics);
            DrawLine(pos, center, center, center - pos - 10, graphics);
            DrawLine(WIDTH - pos, center, center, center + pos + 10, graphics);
            DrawLine(WIDTH - pos, center, center, center - pos - 10, graphics);
            pos = pos + space;
        }
        graphics.drawLine(center, 0, center, HEIGHT);

        /* for (int i = 0; i < 16; i++) {
            graphics.drawLine(pos, center, center, center + pos + 10);
            graphics.drawLine(pos, center, center, center - pos - 10);
            graphics.drawLine(WIDTH - pos, center, center, center + pos + 10);
            graphics.drawLine(WIDTH - pos, center, center, center - pos - 10);
            pos = pos + space;
        } */
    }


    public static void DrawLine(int x1, int y1, int x2, int y2, Graphics graphics) {
        graphics.drawLine(x1, y1, x2, y2);
    }


    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}