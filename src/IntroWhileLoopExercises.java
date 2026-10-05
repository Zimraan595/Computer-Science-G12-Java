import java.util.Scanner;

public class IntroWhileLoopExercises {
    static void main() {
        Scanner input = new Scanner(System.in);

        System.out.println("Sample Run");
        int num = 1;

        while (num != 0) {
            num = input.nextInt();
            input.nextLine();
        }
    }
}
