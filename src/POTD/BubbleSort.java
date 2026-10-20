package POTD;
import java.util.Arrays;
import java.util.Random;

public class BubbleSort {
    public static void main(String[] args) {

        Random rand = new Random();

        int[] numbers = new int[100];
        for (int i = 0; i < 100; i++) {
            numbers[i] = rand.nextInt(98) + 1;
        }
        System.out.println(Arrays.toString(numbers));
    }
}
