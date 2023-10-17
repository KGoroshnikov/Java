package TASK_4.n4;

public class Ship  extends Vehicle{
    Ship(int costPerHour) {
        super(costPerHour);
    }

    @Override
    public void time(int distance) {
        System.out.println("Время: " + distance / 150 + "ч");

    }
    @Override
    public void price(int distance){
        System.out.println("Стоимость: " + distance / 150 * costPerHour + "руб");
    }
}