package TASK_12.n1;

import java.awt.*;

abstract class Shape {
    private Color color;
    private int x;
    private int y;

    public Shape(Color clr, int x, int y) {
        this.color = clr;
        this.x = x;
        this.y = y;
    }

    abstract void draw(Graphics g);

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Color getColor() {
        return color;
    }
}