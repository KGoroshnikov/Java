package Task2;

public class TestBall {
    public static void main(String[] args) {
        Ball ball1 = new Ball(1.5, 2.5);
        ball1.setXY(3, 1.5);
        ball1.move(1, -2);
        System.out.println(ball1.toString());
    }
}
