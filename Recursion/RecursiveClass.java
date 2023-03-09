package Recursion;

public class RecursiveClass {

    public int summingRecursive(int a) {
        // base case
        if (a <= 0)
            return 0;

        // recursive case
        else
            return a + summingRecursive(a - 1);

    }

    // nesne üzerinden erişmek istemiyorsan
    public static int staticSummingRecursive(int a) {

        if (a <= 0)
            return 0;
        else
            return a + staticSummingRecursive(a - 1);

    }

    public static int recFact(int a) {

        if (a <= 1)
            return 1;
        else
            return a * recFact(a - 1);
    }

    // 5 üzeri 3 = 125
    public static int exponantAl(int taban, int us) {
        // base case
        if (us <= 0)
            return 1;

        // recursive case
        else
            return taban * exponantAl(taban, us - 1);

    }

    public static void main(String[] args) {

        RecursiveClass rc = new RecursiveClass();
        System.out.println(rc.summingRecursive(5));

        System.out.println(staticSummingRecursive(10));

        System.out.println(recFact(3));

        System.out.println(exponantAl(4, 3));

    }

}
