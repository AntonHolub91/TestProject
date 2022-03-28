public class Animal {
    protected String name;
    protected String color;

    int var;

    public void walk(String place){
        System.out.println("We are walking here: " + place);
        var = 10;
    }

    public void sleep(){
        System.out.println("Zzzzz");
    }
}
