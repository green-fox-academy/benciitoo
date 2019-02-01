package sierpinskycarpet;
import javafx.scene.layout.BackgroundFill;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Main {
    public static void mainDraw(Graphics graphics) {

        int depth = 3;
        int rectangleSize = WIDTH / 3;


        recursionDraw(rectangleSize, rectangleSize, rectangleSize, depth, graphics);


    }


    public static void recursionDraw (int x1, int y1, int size, int depth, Graphics graphics) {

        graphics.fillRect(x1, y1, size, size);
        int subSide = size / 3;


        if (depth == 0) {
                return;
            } else {
                depth--;
                recursionDraw(subSide, subSide, subSide, depth, graphics);
                //recursionDraw(x1, subSide, subSide, depth, graphics);


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