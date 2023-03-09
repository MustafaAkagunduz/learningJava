package Day13_Abstraction;

public class Dog extends Animal {

    public Dog() {
        super(5);
        System.out.println("Dog is created");

    }

    public void sleep() {
        System.out.println("dog is sleeping");

    }

    public void drink() {

        System.out.println("Dog is drinking");
    }

    public void eat() {

        System.out.println("Dog is eating");

    }

    public void ruff() {
        System.out.println("The cat says ruff!");
    }

}