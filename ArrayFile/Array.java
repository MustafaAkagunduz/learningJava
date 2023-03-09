package ArrayFile;

import java.util.Arrays;

public class Array {

    public static void main(String[] args) {

        int[] a = { 6, 9, 2, 3 };
        int[] b = a;

        Arrays.sort(b);

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

        System.out.println();

        int[] asd = new int[100];
        int aw = 1;
        for (int i = 0; i < asd.length; i++) {
            asd[i] = aw;
            aw++;

        }
        System.out.println();
        System.out.println(aw);

        for (int g : asd) {
            System.out.print(g + " ");
        }

        System.out.println("aka");

    }

}
