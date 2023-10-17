package TASK_2.Task5;

public class DogTester {
    public Dog[] getDogs() {
        return dogs;
    }

    private Dog[] dogs;

    DogTester(int amount){
        this.dogs = new Dog[amount];
    }

    public void addDog(String name, int age){
        for(int i = 0; i < dogs.length; i++){
            if (dogs[i] == null){
                dogs[i] = new Dog(name, age);
                break;
            }
        }
    }
}
