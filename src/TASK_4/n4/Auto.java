package TASK_4.n4;

public class Auto extends Vehicle{
    Auto(int costPerHour) {
        super(costPerHour);
    }
    @Override
    public void time(int distance) {
        System.out.println("Время: " + distance / 100 + "ч");

    }
    @Override
    public void price(int distance){
        System.out.println("Стоимость: " + distance / 100 * costPerHour + "руб");
    }
}