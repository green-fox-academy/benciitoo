package shapeasobject;

import javafx.scene.layout.BackgroundFill;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Main {
    public static void mainDraw(Graphics graphics) {

        RectObj rectObj1 = new RectObj(30, Color.yellow);
        RectObj rectObj2 = new RectObj(15, Color.green);
        RectObj rectObj3 = new RectObj();

        // graphics.drawRect(30, 30, rectObj1.size, rectObj1.size);   így is ki lehet nyerni objektum változót egy sima parancsnál

        rectObj1.drawMe(graphics, 40, 50);
        rectObj2.drawMe(graphics, 90, 30);
        rectObj3.drawMe(graphics, 200, 200);
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