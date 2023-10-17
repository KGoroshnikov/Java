package TASK_2.Task5;

public class TestDog {
    public static void main(String[] args) {
        DogTester dogTester = new DogTester(3);
        dogTester.addDog("Bob", 5);
        dogTester.addDog("William", 1);
        dogTester.addDog("Andrew", 10);
        Dog[] dogsArr = dogTester.getDogs();
        for(Dog i : dogsArr){
            System.out.println("Info: " + i.toString() + " HumanAge: " + i.getHumanAge());
        }
    }
}
