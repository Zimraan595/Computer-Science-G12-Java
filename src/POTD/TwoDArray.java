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
        int sum = 0;

        for (int row = 0; row < table.length; row++) {
            System.out.println("Row " + (row+1) + ": ");
            for (int col = 0; col < table[row].length; col++) {
                System.out.print("Column " + (col+1) + ": ");
                table[row][col] = input.nextInt();
                sum += table[row][col];
            }
        }

        System.out.print("\nTable:\nr|c\t");
        for (int i = 1; i <= cols; i++) {
            System.out.print(i + "\t");
        }
        System.out.println();
        int[] rowsSum = new int[rows];
        int[] colsSum = new int[cols];
        for (int row = 0; row < table.length; row++) {
            System.out.print(row + ":\t");
            for (int col = 0; col < table[row].length; col++) {
                System.out.print(table[row][col] + "\t");
                rowsSum[row] += table[row][col];
                colsSum[col] += table[row][col];
            }
            System.out.println();
        }
        System.out.println("Sum: " + sum);
        for (int i = 0; i < rowsSum.length; i++) {
            System.out.println("Row " + (i+1) +" Sum: " + rowsSum[i]);
        }
        for (int i = 0; i < colsSum.length; i++) {
            System.out.println("Column " + (i+1) +" Sum: " + colsSum[i]);
        }



    }
}
