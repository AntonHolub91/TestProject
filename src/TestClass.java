import java.sql.SQLOutput;
import java.util.Locale;

public class TestClass {
<<<<<<< HEAD

    public static void main(String[] args) {

        Car car1 = new Car();
        car1.color = "Black";
        car1.length = 5000;
        car1.height = 2000;
        car1.width = 2000;

        car1.addWeight(50);
        car1.drive(120);

        car1.addWeight(700);
        car1.drive(100);

        Car car2 = new Car();
        car2.color = "White";
        Car car3 = new Car();
        car3.color = "Red";

        car2.drive(100);
        car3.drive(150);

        Car car4 = new Car("Black");
        System.out.println("Car color is: " + car4.color);

        Car car5 = new Car("Red", 2100, 2000, 5110);
        System.out.println(car5.color + " " + car5.height + " " + car5.width + " " + car5.length);
        System.out.println();

        System.out.println(Car.var);
        Car.var = 100;

        System.out.println(car1.var);
        System.out.println(car2.var);
        System.out.println(car3.var);
        System.out.println(car4.var);
        System.out.println(car5.var);

        Car.method();

        String.format("New %s string", "String");


=======
    public static void main (String[] args) {

        String s = "Hello world!";
        System.out.println(s.equals("Hello world!"));
        System.out.println(s.equals("Hello"));

        
        String s2 = "hello";
        System.out.println(s.equals(s2));
        s = "text";
        s2 = "TEXT";
        System.out.println(s.equals(s2));
        System.out.println(s.equalsIgnoreCase(s2));

        s = "TeXt";
        System.out.println();
        System.out.println(s);
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());

        System.out.println();
        System.out.println(s.charAt(1));
        System.out.println(s.indexOf("Xt"));

        s = "Hello world!";
        System.out.println(s.contains("Hello"));
        System.out.println(s.contains("text"));
        System.out.println(s.length());
        System.out.println();
        System.out.println(s.startsWith("He"));
        System.out.println(s.startsWith("!"));
        System.out.println(s.endsWith("He"));
        System.out.println(s.endsWith("!"));
>>>>>>> 66568745df7c6af7e571ef83a98f6673ca712594

        s = "Hello,world";
        System.out.println();
        String[] array = s.split(",");
        System.out.println(array[0] + "!" + array[1] + "!");

        String str = "My name is %s! I'm %d years old";
        int age = 30;
        String name = "Ivan";
        System.out.println(String.format(str, name, age));

        System.out.println();

        String age2 = "30";
        int a = Integer.parseInt(age2);
        System.out.println(a * 3);

        s = "Hello, world!";
        System.out.println(s.substring(1,5));
        System.out.println(s.substring(7));

        System.out.println(s.substring(7, s.length() - 2));

        String s1 = "Hello ";
        s2 = "world";
        String s3 = "!";
        String res;
        res = s1 + " " + s2 + s3;
        System.out.println(res);

        res = s1.concat(s2).concat(s3);
        System.out.println(res);

    }



}
