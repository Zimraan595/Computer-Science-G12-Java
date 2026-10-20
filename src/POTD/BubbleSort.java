package POTD;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {

        Random rand = new Random();

        int[] numbers = new int[100];
        for (int i = 0; i < 100; i++) {
            numbers[i] = rand.nextInt(98) + 1;
        }
        System.out.println(Arrays.toString(numbers));

        long start = System.nanoTime();
        boolean swaped = true;
        while (swaped) {
            swaped = false;
            for (int i = 1; i < numbers.length; i++) {
                int temp;
                int p = i - 1;
                if (numbers[p] > numbers[i]) {
                    temp = numbers[p];
                    numbers[p] = numbers[i];
                    numbers[i] = temp;
                    swaped = true;
                }

            }
        }
        long end = System.nanoTime();
        long elapsed = end - start;
        System.out.println(Arrays.toString(numbers));
        System.out.println("Completed in " + (elapsed/1000000.0) + "ms");
    }

    public static int sort(int[] array) {
        return 5;
    }
}
