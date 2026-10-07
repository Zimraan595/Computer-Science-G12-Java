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
                wrongCount++;
            }

            if wrongCount 
        }
    }
}
