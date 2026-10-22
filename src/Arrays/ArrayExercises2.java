package Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class ArrayExercises2 {
    public static Random rand = new Random();
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        //Exercise1();
        //Exercise2();
        Exercise3();
        //Exercise4();

    }

    private static void Exercise4() {
        System.out.println("What is your first name?");
        String firstName = input.nextLine();
        Character[] firstNameArrayBackwards = new Character[firstName.length()];
        for (int i = 0; i < firstName.length(); i++) {
            firstNameArrayBackwards[i] = firstName.charAt(firstName.length() - 1 - i);
        }
        for (char letter : firstNameArrayBackwards) {
            System.out.print(letter);
        }
        System.out.println();
    }

    private static void Exercise3() {
        int num = 1000;
        ArrayList<Integer> primeNumbers = new ArrayList<Integer>();
        boolean isPrime;
        for (int i = 2; i < num; i++) {
            isPrime = true;
            for (int n = 2; n <= i / 2; n++) {
                if (i % n == 0) {
                    isPrime = false;
                }
            }
            if (isPrime) {
                primeNumbers.add(i);
            }
        }
        System.out.println("Enter a number between 1-" + primeNumbers.toArray().length);
        int n = input.nextInt();
        System.out.println(primeNumbers.get(n));
    }

    private static void Exercise2() {
        ArrayList<Integer> guesses = new ArrayList<Integer>();
        int num = rand.nextInt(99) + 1;
        int index = 0;
        System.out.println("Guess the number from 1-100");
        while (!guesses.contains(num)) {
            System.out.print("Guess " + ++index + ": ");
            int guess = input.nextInt();
            input.nextLine();
            guesses.add(guess);
            if (guess > num) {
                System.out.println("Lower");
            } else if (guess < num) {
                System.out.println("Higher");
            }
        }
        System.out.print("You Got it!");
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
