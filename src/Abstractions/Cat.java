package Abstractions;

public class Cat extends Animal {
    @Override
    public void saySmth() {
        System.out.println("Meow meow!");
    }

    @Override
    public void eat() {
        System.out.println("I like milk!");
    }
}
