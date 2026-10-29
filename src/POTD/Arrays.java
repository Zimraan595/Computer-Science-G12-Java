package POTD;
import java.util.Scanner;
import java.util.ArrayList;

public class Arrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Length of Array: ");
        int length = input.nextInt();
        input.nextLine();

        int[] marks = new int[length];
        int sum = 0;

        for (int i = 0; i < marks.length; i++) {
            System.out.print((i + 1) + ". ");
            int mark = input.nextInt();
            input.nextLine();
            marks[i] = mark;
            sum += mark;
        }

        System.out.println("Average: " + (sum/(double)(marks.length)));

        ArrayList<Integer> marks2 = new ArrayList<>();

        



    }
}
