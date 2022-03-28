import java.sql.SQLOutput;
import java.util.Locale;

public class TestClass {

    public static void main(String[] args) {

        Cat cat = new Cat();
        Dog dog = new Dog();

        cat.name = "Vasya";
        dog.name = "Barsik";

        cat.color = "White";
        dog.color = "Black";

        cat.walk("Backyard");
        dog.walk("Park");

        cat.feed("Milk");
        dog.sit();

        System.out.println("Cat name is: " + cat.name + ". " + cat.name + " color is " + cat.color);
        System.out.println("Dog name is: " + dog.name + ". " + dog.name + " color is " + dog.color);

        cat.sound();
        dog.sound();



    }

}
