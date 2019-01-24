import javafx.scene.layout.BackgroundFill;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Checkerboard {
    public static void mainDraw(Graphics graphics) {
        // Fill the canvas with a checkerboard pattern.


        int kockak = 8;
        int size = WIDTH / kockak;

        for (int i = 0; i < kockak; i++) {
            for (int j = 0; j < kockak; j++) {
                if ((i % 2 == 0) ^ (j % 2 == 0)) {    // XOR
           //     if ((i % 2) == (j % 2)) {
                    graphics.setColor(Color.black);
                }   else {
                    graphics.setColor(Color.white);
                }
                graphics.fillRect(i * size, j * size, size, size);
            }
        }

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