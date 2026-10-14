package POTD;
import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Table Maker");
        System.out.print("Number of rows: ");
        int rows = input.nextInt();
        input.nextLine();
        System.out.print("Number of columns: ");
        int cols = input.nextInt();
        input.nextLine();

        int[][] table = new int[rows][cols];

        for (int row = 0; row < table.length; row++) {
            System.out.println("Row " + row + ": ");
            for (int col = 0; col < table[row].length; col++) {
                System.out.print("Column " + col + ": ");
                table[row][col] = input.nextInt();
            }
        }

        System.out.print("\t");
        for (int i = 1; i <= cols; i++) {
            System.out.print(i + "\t");
        }
        for (int row = 0; row < table.length; row++) {
            System.out.print(row + ":\t");
            for (int col = 0; col < table[row].length; col++) {
                System.out.print(table[row][col] + "\t");
            }
            System.out.println();
        }



    }
}
