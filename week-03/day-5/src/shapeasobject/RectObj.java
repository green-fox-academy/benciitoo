package shapeasobject;

import java.awt.*;

public class RectObj {
    int size;
    Color color;


    public RectObj(){
        size = 50;
        color = Color.pink;
    }


    public RectObj(int size, Color color) {
        this.size = size;
        this.color = color;
    }


    public void drawMe(Graphics graphics, int startX, int startY){
        graphics.setColor(this.color);
        graphics.drawRect(startX, startY, this.size, this.size);
    }

}