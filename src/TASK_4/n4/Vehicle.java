package TASK_4.n4;

public abstract class Vehicle {
    protected final int costPerHour;

    Vehicle(int costPerHour){
        this.costPerHour = costPerHour;
    }

    abstract void time(int distance);
    abstract void price(int distance);

    public static void main(String [] args){
        System.out.println("Авто:");
        Vehicle vehicle1 = new Auto(500);
        vehicle1.price(500);
        vehicle1.time(500);

        System.out.println("\nСамолет:");
        Vehicle vehicle2 = new Plane(7000);
        vehicle2.price(10000);
        vehicle2.time(10000);

        System.out.println("\nПоезд:");
        Vehicle vehicle3 = new Train(250);
        vehicle3.price(2000);
        vehicle3.time(2000);

        System.out.println("\nКорабль:");
        Vehicle vehicle4 = new Ship(750);
        vehicle4.price(1000);
        vehicle4.time(1000);

    }

}