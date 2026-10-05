import java.util.Scanner;

public class IntroWhileLoopExercises {

    static Scanner input = new Scanner(System.in);

    static void main() {
//        Problem1();
        System.out.println("Sample Run");
        System.out.print("Enter a number: ");
        int new_num = input.nextInt();
        input.nextLine();

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
