package TASK_4.n3;

public class Person {
    private String fullName;
    private int age;

    public void setFullName(String fullName){
        this.fullName = fullName;
    }
    public void setAge(int age){
        this.age = age;
    }
    Person(String fullName, int age){
        this.fullName = fullName;
        this.age = age;
    }
    Person(){}

    public void move(){
        System.out.printf("%s идет%n", this.fullName);
    }
    public void talk(){
        System.out.printf("%s говорит%n", this.fullName);
    }

    public static void main(String [] args){
        Person person1 = new Person();
        person1.setAge(20);
        person1.setFullName("Elon");

        Person person2 = new Person("Bob",100);

        person1.move();
        person1.talk();

        person2.move();
        person2.talk();
    }
}