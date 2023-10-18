package TASK_12.n1;
import java.util.Random;

import javax.swing.JFrame;

import java.awt.Graphics;
import java.awt.Color;

public class app extends JFrame
{
    final int WINDOW_WIDTH = 800;
    final int WINDOW_HEIGHT = 800;

    Shape[] shapes;

    public app()
    {
        //Set JFrame title
        super("Draw A Circle In JFrame");

        //Set default close operation for JFrame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Set JFrame size
        setSize(WINDOW_WIDTH,WINDOW_HEIGHT);

        //Make JFrame visible
        setVisible(true);

        shapes = new Shape[20];
        for(int i = 0; i < shapes.length; i++){
            int r = (int) (Math.random() * 255);
            int b = (int) (Math.random() * 255);
            int g =(int) (Math.random() * 255);

            if (new Random().nextBoolean())
                shapes[i] = new Circle(new Color(r,g,b), new Random().nextInt(WINDOW_WIDTH), new Random().nextInt(WINDOW_HEIGHT), 50);
            else
                shapes[i] = new Rectangle(new Color(r,g,b), new Random().nextInt(WINDOW_WIDTH), new Random().nextInt(WINDOW_HEIGHT), 200, 100);
        }
    }

    @Override
    public void paint(Graphics g)
    {
        super.paint(g);

        for (Shape i : shapes){
            i.draw(g);
        }
    }

    public static void main(String[]args)
    {
        app a = new app();
    }
}