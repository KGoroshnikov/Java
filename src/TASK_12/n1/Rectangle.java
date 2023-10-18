package TASK_12.n1;

import java.awt.*;

class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle(Color clr, int x, int y, int width, int height) {
        super(clr, x, y);
        this.width = width;
        this.height = height;
    }

    public void draw(Graphics g){
        g.setColor(super.getColor());
        g.fillRect(super.getX(),super.getY(), width, height);
    }
}