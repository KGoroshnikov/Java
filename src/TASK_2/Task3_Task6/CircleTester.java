package TASK_2.Task3_Task6;

public class CircleTester {
    private Circle[] circles;
    private int arr_len;

    public Circle[] getCircles() {
        return circles;
    }

    public void setCircles(Circle[] circles) {
        this.circles = circles;
    }

    public int getArr_len() {
        return arr_len;
    }

    public void setArr_len(int arr_len) {
        this.arr_len = arr_len;
    }

    CircleTester(int amount){
        this.arr_len = amount;
        this.circles = new Circle[amount];

        for(int i = 0; i < amount; i++){
            Circle new_circle = new Circle(i + 1, new Point(i + 1, i + 2));
            this.circles[i] = new_circle;
        }
    }

    public void compareCircles(Circle first, Circle second){
        System.out.println("\nCompare: ");
        System.out.println("First TASK_1.Task3_Task6.Circle: " + first.toString());
        System.out.println("Second TASK_1.Task3_Task6.Circle: " + second.toString());

        if (first.getArea() == second.getArea()) System.out.print("Area is equal, ");
        else System.out.print("Area is NOT equal, ");

        if (first.getLength() == second.getLength()) System.out.print("Length is equal.");
        else System.out.print("Length is NOT equal.");

        System.out.print("\n");
    }

    public static void main(String[] args) {
        // ЗАДАНИЕ 3
        CircleTester circleTester = new CircleTester(10);
        Circle[] arrCircles = circleTester.getCircles();
        for(int i = 0; i < circleTester.getArr_len(); i++){
            System.out.println(arrCircles[i].toString());
        }

        // ЗАДАНИЕ 6
        circleTester.compareCircles(arrCircles[0], arrCircles[0]);
        circleTester.compareCircles(arrCircles[2], arrCircles[3]);
    }
}
