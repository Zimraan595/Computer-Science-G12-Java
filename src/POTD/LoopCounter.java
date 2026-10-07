package POTD;
import java.util.Scanner;

public class LoopCounter {

    final static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int num;
        int wrongCount = 0;
        while (true) {
            System.out.print("Enter a number from 1-20: ");
            num = input.nextInt();

            if (1 <= num && num <= 20) {
                System.out.println("You have entered the a number that meets the requirements!");
                break;
            } else {
                System.out.println("Wrong number");
                wrongCount++;
                if (wrongCount == 3) {
                    System.out.println("please stop being annoying!");
                } else if (wrongCount == 5) {
                    System.out.println("I’m warning you! Please enter the right number!");
                } else if (wrongCount >= 6) {
                    System.out.println("Terminating your program");
                    break;
                }

            }
        }
    }
}
