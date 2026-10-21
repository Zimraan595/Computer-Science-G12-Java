package POTD;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {

        Random rand = new Random();
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[100];
        for (int i = 0; i < 100; i++) {
            numbers[i] = rand.nextInt(98) + 1;
        }
        System.out.println(Arrays.toString(numbers));

        int swaped = 1;
        int num_len = numbers.length;
        long start = System.nanoTime();
        while (swaped > 0) {
            swaped = 0;
            for (int i = 1; i < num_len; i++) {
                int temp;
                int p = i - 1;
                if (numbers[p] > numbers[i]) {
                    temp = numbers[p];
                    numbers[p] = numbers[i];
                    numbers[i] = temp;
                    swaped = p;
                }
            }
            num_len = swaped;
        }
        long end = System.nanoTime();
        long elapsed = end - start;
        System.out.println(Arrays.toString(numbers));
        System.out.println("Completed in " + (elapsed/1000000.0) + "ms");
    }
}
