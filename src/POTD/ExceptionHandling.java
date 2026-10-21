package POTD;
import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String num1 = input.nextLine();
        System.out.print("Enter another number: ");
        String num2 = input.nextLine();
        int num1int;
        int num2int;
        int value;
        try {
            num1int = Integer.parseInt(num1);
            num2int = Integer.parseInt(num2);

        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Error: Please enter valid whole numbers only.");
        } finally {
            System.out.println("Calculation attempt logged.");
            input.close();
        }
    }
}
