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
        int swaped = 0;
        int n;
        int num_len = numbers.length;
        while (swaped >= 0) {
            int static_swaped = swaped;
            for (int i = 1; i < num_len-static_swaped; i++) {
                int temp;
                n = i + static_swaped;
                System.out.println(i + " " + n);
                int p = n - 1;
                System.out.println(numbers[p] + ">" + numbers[n] + ": " + (numbers[p] > numbers[n]));
                if (numbers[p] > numbers[n]) {
                    temp = numbers[p];
                    numbers[p] = numbers[n];
                    numbers[n] = temp;
                    swaped = p;
                } else if (i == num_len - static_swaped) {
                    if (static_swaped == swaped) {
                        swaped = -1;
                    }
                }
            }
        }
        long end = System.nanoTime();
        long elapsed = end - start;
        System.out.println(Arrays.toString(numbers));
        System.out.println("Completed in " + (elapsed/1000000.0) + "ms");
    }
}
