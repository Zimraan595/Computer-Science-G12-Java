import java.util.Scanner;

public class IntroWhileLoopExercises {

    static Scanner input = new Scanner(System.in);

    static void main() {
//        Problem1();
//        Problem2();
        

        input.close();
    }

    private static void Problem2() {
        System.out.println("Sample Run");
        int old_num = 0;
        int new_num = 1;

        while (new_num != 0) {
            System.out.print("Enter a number: ");
            new_num = input.nextInt();
            input.nextLine();
            old_num += new_num;
            System.out.println("Total: " + old_num);
        }
    }

    private static void Problem1() {
        System.out.println("Sample Run");
        int num = 1;

        while (num != 0) {
            num = input.nextInt();
            input.nextLine();
            if (num % 2 == 0) {
                System.out.println("Even");
            } else {
                System.out.println("Odd");
            }
        }
    }
}
