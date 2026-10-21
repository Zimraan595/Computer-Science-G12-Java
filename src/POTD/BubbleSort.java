package POTD;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {

        Random rand = new Random();
//        Scanner input = new Scanner(System.in);

        int number_of_nums = 30000;
        int[] numbers = new int[number_of_nums];
        for (int i = 0; i < number_of_nums; i++) {
            numbers[i] = rand.nextInt() + 1;
        }
//        System.out.println(Arrays.toString(numbers));

        BubbleSort(numbers.clone());
        BubbleSort(numbers.clone());
        BubbleSort(numbers.clone());

        System.out.println("---------------------------");

        BubbleSort2(numbers.clone());
        BubbleSort2(numbers.clone());
        BubbleSort2(numbers.clone());

        System.out.println("---------------------------");

        ZimraanSort(numbers.clone());
        ZimraanSort(numbers.clone());
        ZimraanSort(numbers.clone());

    }

    private static void BubbleSort(int[] numbers) {
        System.out.println("\nBubble Sort Slow");
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
                    swaped = i;
                }
            }
            num_len = swaped;
        }
        long end = System.nanoTime();
        long elapsed = end - start;
//        System.out.println(Arrays.toString(numbers));
        System.out.println("Completed in " + (elapsed/1000000.0) + "ms");
    }
    private static void BubbleSort2(int[] numbers) {
        System.out.println("\nBubble Sort Fast");
        int num_len = numbers.length;
        int lower_bound = 0;
        int upper_bound = num_len;
        int swaped = 1;
        long start = System.nanoTime();
        while (swaped > 0) {
            swaped = 0;
            for (int i = lower_bound+1; i < upper_bound; i++) {
                int temp;
                int p = i - 1;
                if (numbers[p] > numbers[i]) {
                    temp = numbers[p];
                    numbers[p] = numbers[i];
                    numbers[i] = temp;
                    swaped = i;
                }
            }
            upper_bound = swaped;
            for (int i = upper_bound-1; i > lower_bound; i--) {
                int temp;
                int p = i - 1;
                if (numbers[p] > numbers[i]) {
                    temp = numbers[p];
                    numbers[p] = numbers[i];
                    numbers[i] = temp;
                    swaped = i;
                }
            }
            lower_bound = swaped;
            if (lower_bound == upper_bound) {
                swaped = 0;
            }
        }
        long end = System.nanoTime();
        long elapsed = end - start;
//        System.out.println(Arrays.toString(numbers));
        System.out.println("Completed in " + (elapsed/1000000.0) + "ms");
    }

    private static void ZimraanSort(int[] numbers) {
        System.out.println("\nZimraan Sort");
        long start = System.nanoTime();
        Arrays.sort(numbers);
        long end = System.nanoTime();
        long elapsed = end - start;
        System.out.println("Completed in " + (elapsed/1000000.0) + "ms");
    }
}
