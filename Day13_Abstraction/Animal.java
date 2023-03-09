

package Day13_Abstraction;

//ABSTRACTION VE OBJECT CASTING.
//ABSTRACT CLASS'LAR ABSTRACT VEYA NON-ABSTRCT METOTLAR İÇEREBİLİR...
//NESNE TÜRETİLEMEZ. onu extend eden sub-classlar tüm abstract metotları override etmeli
//veya extend eden sub-class'ımız da abstract ise, o metodun ayrıca yazılmasına gerek yoktur
//method overriding:  signature aynı olmalıdır.

//OBJECT CASTING
//SÜPER CLASS'IN SUB-CLASS METOTLARINA ERİŞMESİNİ SAĞLAR(NORMALDE OLAN BİR ŞEY DEĞİL)

public abstract class Animal {
    private int age; // VS private int age;
    //Scanner s= new Scanner(System.in);
    public void drink() {

        System.out.println("Animal is drinking");
    }

    public Animal(int age) {
        this.age = age;
        System.out.println("An animal has been created!");
    }

    public abstract void eat();

    public int getAge() {
        return this.age;
    }

    public void sleep() {
        System.out.println("animal is sleeping");

    }

    public static void main(String[] args) {

        // Animal aa = new Animal (5);
        Dog dd = new Dog();
        // Cat cc = new Cat();

        dd.eat();
        // cc.eat();

        dd.drink();
        // c.drink();

        // casting yapalım

        Animal myDog = new Dog(); // an itibariyle myDog, dog metotlarını kullanamıyor
        Dog gecisDogu = (Dog) myDog; // casting yaptık.
        gecisDogu.ruff();
        // myDog.ruff() gecisDogu ruff'ı kullanabilir ama myDog kullanamaz

        Object str = "str";
        String realStr = (String) str;
        // gibi...

        // what happens if...
        Dog doggy = new Dog();
        if (doggy instanceof Animal) {
            Animal animal = (Animal) doggy;
            animal.sleep(); // sub-class metotlara ulaşmanın bir başka yolu...
        }
        doggy.sleep();

    }
}
