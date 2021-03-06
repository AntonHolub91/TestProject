public class TestCycles {

    public static void main(String[] args) {

        System.out.println("Start program");

        for (int i = 0; i < 10; i++) {
            System.out.println(i * 10);
        }

        System.out.println("End program");

        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }

        int[] array = new int[11];

        for (int i = 0; i < 11; i++) {
            array[i] = i * 2;
        }

        for (int i = 0; i < 11; i++) {
            System.out.println("Element with index " + i + " is: " + array[i]);
        }

        for (int element: array){
            System.out.println(element);
        }

        System.out.println();
        int i = 0;
        boolean bool = true;
        while (bool) {
            System.out.println("While: " + i);
            i++;
            if (i == 5) bool = false;
        }

        i = 5;
        do {
            System.out.println("do: " + i);
            i++;
        } while (i < 5);
        System.out.println();

        for (int q = 16; q < 20;) {
            System.out.println(q * 2);
        }


    }


}
