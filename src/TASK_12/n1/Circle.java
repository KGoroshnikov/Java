package TASK_12.n1;

import java.awt.*;

class Circle extends Shape {
    private int radius;

    public Circle(Color clr, int x, int y, int r) {
        super(clr, x, y);
        this.radius = r;
    }

    public void draw(Graphics g){

        //draw circle outline

        //set color to RED
        //So after this, if you draw anything, all of it's result will be RED
        g.setColor(super.getColor());

        //fill circle with RED
        g.fillOval(super.getX(),super.getY(), radius * 2, radius * 2);
    }
}