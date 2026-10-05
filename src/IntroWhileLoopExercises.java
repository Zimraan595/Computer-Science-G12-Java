import java.util.Scanner;

public class IntroWhileLoopExercises {

    public Scanner input = new Scanner(System.in);

    static void main() {
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
