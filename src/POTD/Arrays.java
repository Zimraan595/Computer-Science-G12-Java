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

        System.out.println("Average: " + (sum/(double)(marks.length)) + "\n");

        ArrayList<Integer> marks2 = new ArrayList<Integer>();

        System.out.print("Length of new Array: ");
        length = input.nextInt();
        input.nextLine();

        sum = 0;

        for (int i = 0; i < length; i++) {
            System.out.print((i + 1) + ". ");
            int mark = input.nextInt();
            input.nextLine();
            marks2.add(mark);
            sum += mark;
        }

        marks2.add(76);
        marks2.add(84);

        marks2.remove(2);

        System.out.println("Fist Value: " + marks2.getFirst());

        for (int i : marks2) {
            System.out.println(i);
        }

        System.out.println("Average: " + (sum/(double)(length)));
    }
}
