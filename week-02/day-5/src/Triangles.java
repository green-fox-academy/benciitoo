import javafx.scene.layout.BackgroundFill;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangles {
    public static void mainDraw(Graphics graphics) {

        int triangleSideLength = 20;
        int triangleHeight = 18;
        int howManyTrianglesAtTheBottom = 16;

        drawTriangles(triangleSideLength, triangleHeight, howManyTrianglesAtTheBottom, graphics);
    }


        public static void drawTriangles (int alap, int triHeight, int bottomNumber, Graphics graphics){
            int seged = 0;
            for (int i = 0; i < bottomNumber; i++) {
                for (int j = 0; j < (bottomNumber - i); j++) {
                    graphics.drawLine(j*alap+(i*alap)/2, HEIGHT-i*triHeight, j*alap+(i*alap)/2+alap, HEIGHT-i*triHeight );
                    graphics.drawLine(j*alap+(i*alap)/2, HEIGHT-i*triHeight, j*alap+(i*alap)/2+alap/2, HEIGHT-i*triHeight-triHeight );
                    graphics.drawLine(j*alap+(i*alap)/2+alap, HEIGHT-i*triHeight, j*alap+(i*alap)/2+alap/2, HEIGHT-i*triHeight-triHeight );
                }
                seged = seged + triHeight;
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