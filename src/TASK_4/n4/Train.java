package TASK_4.n4;

public class Train extends Vehicle{
    Train(int costPerHour){
        super(costPerHour);
    }
    @Override
    public void time(int distance) {
        System.out.println("Время: " + distance / 300 + "ч");

    }
    @Override
    public void price(int distance){
        System.out.println("Стоимость: " + distance / 300 * costPerHour + "руб");
    }
}