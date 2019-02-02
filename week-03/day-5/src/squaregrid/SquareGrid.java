package squaregrid;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SquareGrid {
    public static void mainDraw(Graphics graphics) {

        int depth = 4;
        rectDraw(0, 0, WIDTH / 2, depth, graphics);


    }


    public static void rectDraw (int x1, int y1, int size, int depth, Graphics graphics) {
        int newSize = size / 2;

        if (depth == 0) {
            return;
        } else {

            graphics.drawRect(x1 + newSize, y1 + newSize, size, size);
            for (int i = 1; i < (depth) * 2; i++) {
                graphics.drawRect(x1 + newSize + i, y1 + newSize + i, size - 2 * i, size - 2 * i);
                graphics.drawRect(x1 + newSize - i, y1 + newSize - i, size + 2 * i, size + 2 * i);
            }
            depth--; // Azért rajzol még az utolsókra is, mert a for ciklus után csökkenti a depth-t

            rectDraw(x1, y1, newSize, depth, graphics);
            rectDraw(x1 + size, y1, newSize, depth, graphics);
            rectDraw(x1, y1 + size, newSize, depth, graphics);
            rectDraw(x1 + size, y1 + size, newSize, depth, graphics);








        }

    }




    // Don't touch the code below
    static int WIDTH = 512;
    static int HEIGHT = 512;

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