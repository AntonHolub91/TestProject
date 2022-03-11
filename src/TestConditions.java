public class TestConditions {
    public static void main(String[] args) {
        int i;
        i = 15;

        if (i > 10) {
            System.out.println("Congratulations");
            if (i <= 15) {
                System.out.println("i = 15");
            }
            else
                System.out.println("i > 15");
        }
        else {
            System.out.println("You lost");
        }

        i = 423;

        switch(i) {
            case(1):
                System.out.println("q");
                break;
            case(2):
                System.out.println("w");
                break;
            default:
                System.out.println("e");
        }

    }
}
