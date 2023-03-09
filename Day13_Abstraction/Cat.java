package Day13_Abstraction;

public abstract class Cat extends Animal {

    public Cat() {
        super(12);
        System.out.println("Cat is created");
    }

    public void eat() {
        System.out.println("cat is eating");
            }

    public void meow() {
        System.out.println("The cat says meow");
    }

}
