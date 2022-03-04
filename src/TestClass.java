public class TestClass {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        byte a = 127; // -128 127
        System.out.println(a);

        short b = -100; // -32768 32767
        int c;
        c = 100;
        long d = -1232323;

        System.out.println(a + " " + b);

        boolean boolean1 = true;
        boolean boolean2 = false;
        System.out.println(boolean1);
        System.out.println(boolean2);

        boolean boolean3 = 1 + 2 < 5;
        boolean boolean4 = 1 + 2 >5;
        System.out.println();
        System.out.println(boolean3);
        System.out.println(boolean4);

        String str = "Hello";
        String str2 = "World!";
        String str3 = str + " " + str2;
        System.out.println(str3);

        char char1 = 'a';
        System.out.println(char1);


    }



}
