import javafx.scene.layout.BackgroundFill;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlay {
    public static void mainDraw(Graphics graphics) {

        int divided = 32;
        int side = WIDTH / divided;


        for (int i = 0; i < divided; i++) {
            graphics.setColor(Color.green);
            graphics.drawLine(0, side * i, side * i, HEIGHT);
            graphics.setColor(Color.MAGENTA);
            graphics.drawLine(side * i, 0, WIDTH, side * i);

        }


       // rajzol(Color.green, graphics);
    }
    /*public static void rajzol (Color valami, Graphics graphics){

        graphics.setColor(valami);
    }*/


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