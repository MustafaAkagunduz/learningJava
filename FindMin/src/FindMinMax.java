import java.util.Scanner;

public class FindMinMax {

    Scanner scn = new Scanner(System.in);
    private int min, max;

    public void setMin(int min) {

        this.min = min;
    }

    public int getMin() {
        return this.min;
    }

    public int getMax() {

        return this.max;
    }

    public void setMax(int max) {

        this.max = max;
    }

    public int findMin(int[] array) {

        setMin(array[0]);

        for (int i = 1; i < array.length; i++) {

            if (array[i] < min)
                setMin(array[i]);

        }

        return getMin();
    }

    public int findMax(int[] array) {

        setMax(array[0]);

        for (int i = 1; i < array.length; i++) {

            if (array[i] > max)
                setMax(array[i]);

        }

        return getMax();
    }

    public static void main(String[] args) {

        FindMinMax findMinMax = new FindMinMax();
        int[] myArray = { 15, 3, 77, 43, 1, 98, 1000, -6 };

        System.out.println();
        System.out.println(
                "Minimum element of the array is: " + findMinMax.findMin(myArray) + " and the maximum element" +
                        " of the array is: " + findMinMax.findMax(myArray));
        System.out.println();
    }

}