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
            int result = computer_choice - user_choice; 
            
            if (result == 0) {
                System.out.println("tie");
            } else if () {
                
            }


        }
    }
}
