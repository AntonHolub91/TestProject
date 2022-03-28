package Abstractions;

public abstract class Animal {

    public abstract void saySmth();
    public abstract void eat();

    public void walk(String place){
        System.out.println("i'm walking here: " + place);
    }

}
