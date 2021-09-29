package Arrays;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[20];
        fillArray(array);
        System.out.println("Array before changes:");
        System.out.println(Arrays.toString(array));
        changeElements(array);
        System.out.println("Array after changes:");
        System.out.println(Arrays.toString(array));
    }

    public static int[] fillArray(int[] array) {
        for (int i = 0; i < 20; i++) {
            array[i] = new Random().nextInt(21) - 10;
        }
        return array;
    }

    public static int[] changeElements(int[] array) {
        int maxIndex = 0;
        int minIndex = 0;
        int maxNegative = -10;
        int minPositive = 10;
        int temp;

        for (int i = 0; i < array.length; i++) {
            if ((array[i] < 0) && (array[i] > maxNegative)) {
                maxNegative = array[i];
                maxIndex = i;
            }
            if ((array[i] > 0) && (array[i] < minPositive)) {
                minPositive = array[i];
                minIndex = i;
            }

        }

        System.out.println("Min positive number : " + array[minIndex]);
        System.out.println("Max negative number : " + array[maxIndex]);
        temp = array[maxIndex];
        array[maxIndex] = array[minIndex];
        array[minIndex] = temp;
        return array;
    }
}