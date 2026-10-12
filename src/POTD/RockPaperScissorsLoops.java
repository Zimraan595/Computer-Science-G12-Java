package POTD;
import java.util.Scanner;
import java.util.*;

public class RockPaperScissorsLoops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int user_choice;
        int computer_choice;
        System.out.println("Lets play rock paper scissors!");

        while (true) {
            System.out.println("(1) Rock, (2) Paper, (3) Scissors");
            user_choice = input.nextInt();
            computer_choice = rand.nextInt(3) + 1;
            
            if (computer_choice == user_choice) {
                System.out.println("Tie");
            } else if ((user_choice == 1 && computer_choice == 3) ||
                    (user_choice == 2 && computer_choice == 1) ||
                    (user_choice == 3 && computer_choice == 2)) {
                System.out.println("You Win!");
            }
            else {
                System.out.println("You Loose!");
            }


        }
    }
}
