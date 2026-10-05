package Loops;
import java.util.Scanner;

public class CountedLoop {

    static Scanner input = new Scanner(System.in);

    public static void main() {
//        Problem1();
//        Problem2();
//        Prooblem3();
//        Problem4();
//        Problem5();
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        input.nextLine();
        
    }

    private static void Problem5() {
        System.out.println("Num\t\tSquare\tCube");
        for (int i = 2; i <= 20; i++) {
            System.out.println(i + "\t\t" + i*i + "\t\t" + i*i*i);
        }
    }

    private static void Problem4() {
        for (int i = 0; i >= -10; i--) {
            System.out.println(i);
        }
    }

    private static void Prooblem3() {
        for (int i = 100; i >= 0; i--) {
            System.out.println(i);
        }
    }

    private static void Problem2() {
        for (int i = 2; i < 100; i += 2) {
            System.out.println(i);
        }
    }

    private static void Problem1() {
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
    }
}
