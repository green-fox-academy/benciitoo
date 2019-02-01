package recursivedrawing;
import javafx.scene.layout.BackgroundFill;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class recursivedrawing {
    public static void mainDraw(Graphics graphics) {

        int depth = 6;
        int startX = 0;
        int startY = 0;
        int size = WIDTH / 3;

        graphics.setColor(Color.yellow);
        graphics.fillRect(0,0, WIDTH, HEIGHT);
        graphics.setColor(Color.black);


        recursionDraw(0, 0, 729, depth, graphics);


    }


    public static void recursionDraw(int startX, int startY, int size, int depth, Graphics graphics) {
            int newsize = size / 3;
        depth--;
        if (depth > 0) {

            graphics.drawLine(startX, startY + newsize, startX + size, startY + newsize);
            graphics.drawLine(startX, startY + 2 * newsize, startX + size, startY + 2 * newsize);
            graphics.drawLine(startX + newsize, startY, startX + newsize, startY + size);
            graphics.drawLine(startX + 2 * newsize, startY, startX + 2 * newsize, startY + size);

            recursionDraw(startX + size / 3, startY, newsize, depth, graphics);
            recursionDraw(startX, startY + size / 3, newsize, depth, graphics);
            recursionDraw(startX + 2* (size / 3), startY + size / 3, newsize, depth, graphics);
            recursionDraw(startX + size / 3, startY + 2 * (size / 3), newsize, depth, graphics);

        } else {
            return;
        }


    }


    // Don't touch the code below
    static int WIDTH = 729;
    static int HEIGHT = 729;

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