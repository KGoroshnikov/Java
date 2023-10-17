package TASK_4.n4;

public class Plane extends Vehicle{
    Plane(int costPerHour) {
        super(costPerHour);
    }
    @Override
    public void time(int distance) {
        System.out.println("Время: " + distance / 1000 + "ч");

    }
    @Override
    public void price(int distance){
        System.out.println("Стоимость: " + distance / 1000 * costPerHour + "руб");
    }
}