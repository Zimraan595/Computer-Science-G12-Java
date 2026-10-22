package Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class ArrayExercises2 {
    public static Random rand = new Random();
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        //Exercise1();
        ArrayList<Integer> guesses = new ArrayList<Integer>();
        int num = rand.nextInt(99) + 1;
        System.out.println("Guess the number from 1-100");
        while (num )
    }

    private static void Exercise1() {
        int[] num = new int[10];
        for (int i = 0; i < num.length; i++) {
            num[i] = rand.nextInt(99) + 1;
        }
        System.out.println();
        for (int singleNumber : num) {
            System.out.print(singleNumber + ", ");
        }
    }
}
