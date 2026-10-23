package Arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class ArrayExercises2 {
    public static Random rand = new Random();
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
//        Exercise1();
//        Exercise2();
//        Exercise3();
//        Exercise4();
//        Exercise5();
        System.out.println("Lets play tic tak toe");
        boolean gameLoop = true;
        String[][] board = new String[3][3];
        String[][] selectionBoard = new String[3][3];

        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                board[row][col] = " ";
            }
        }

        int index = 0;
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                selectionBoard[row][col] = String.valueOf(++index);
            }
        }

        int width = 1;
        int selection;
        String[] playerChar = {
                "x",
                "o"
        };

        while (gameLoop) {
            System.out.println("\nGame board");
            PrintBoard(board, width);
            System.out.println("\nSelection board");
            PrintBoard(selectionBoard, width);

            for (int i = 1; i <= 2; i++) {
                boolean choiceMade = false;
                while (!choiceMade) {
                    System.out.println("P" + i + " - please make a selection");
                    selection = input.nextInt() - 1;
                    input.nextLine();
                    int row = selection / 3;
                    int col = selection % 3;
                    if (board[row][col].equals(" ")) {
                        board[row][col] = playerChar[i - 1];
                        choiceMade = true;
                    } else {
                        System.out.println("That position is taken");
                    }
                }

                if (hasWon(board, playerChar[i - 1])) {
                    PrintBoard(board, width);
                    System.out.println("P" + i + " Wins!");
                    gameLoop = false;
                    break;
                }

                boolean full = true;
                for (String[] r : board) {
                    for (String item : r) {
                        if (item.equals(" ")) full = false;
                    }
                }
                if (full) {
                    PrintBoard(board, width);
                    System.out.println("It's a tie!");
                    gameLoop = false;
                    break;
                }

            }
        }
    }

    private static boolean hasWon(String[][] b, String p) {
        
    }

    private static void PrintBoard(String[][] board, int width) {
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                System.out.print(board[row][col]);
                if (col != board[row].length - 1) {
                    System.out.print(" ".repeat(width) + "|" + " ".repeat(width));
                } else {
                    System.out.println();
                }
            }
            if (row != board.length - 1) {
                System.out.println("—————" + "—".repeat(width *4));
            }
        }
    }

    private static void Exercise5() {
        String[] month = {
                "Jan",
                "Feb",
                "March",
                "April",
                "May",
                "June",
                "July",
                "Aug",
                "Sep",
                "Oct",
                "Nov",
                "Dec"
        };
        int[] rainFall = new int[12];
        String[] comments = new String[12];
        for (int i = 0; i < rainFall.length; i++) {
            System.out.print("Enter the rainfall for " + month[i] + ": ");
            int rainfall = input.nextInt();
            input.nextLine();
            rainFall[i] = rainfall;
        }
        int[] rawRainFall = rainFall.clone();
        int index = 0;
        int max1 = 0;
        int max2 = 0;
        int max3 = 0;
        for (int i = 0; i < rainFall.length; i++) {
            if (max1 < rainFall[i]) {
                index = i;
                max1 = rainFall[i];
            }
        }
        rainFall[index] = 0;
        comments[index] = "Bring and Umbrella";
        for (int i = 0; i < rainFall.length; i++) {
            if (max2 < rainFall[i]) {
                index = i;
                max2 = rainFall[i];
            }
        }
        rainFall[index] = 0;
        comments[index] = "Bring and Umbrella";
        for (int i = 0; i < rainFall.length; i++) {
            if (max3 < rainFall[i]) {
                index = i;
                max3 = rainFall[i];
            }
        }
        comments[index] = "Bring and Umbrella";
        rainFall = rawRainFall.clone();

        for (int i = 0; i < rainFall.length; i++) {
            System.out.println(month[i]);
            System.out.println(rainFall[i]);
            if (comments[i] != null) {
                System.out.println(comments[i]);
            }
            System.out.println();
        }
    }

    private static void Exercise4() {
        System.out.println("What is your first name?");
        String firstName = input.nextLine();
        Character[] firstNameArrayBackwards = new Character[firstName.length()];
        for (int i = 0; i < firstName.length(); i++) {
            firstNameArrayBackwards[i] = firstName.charAt(firstName.length() - 1 - i);
        }
        for (char letter : firstNameArrayBackwards) {
            System.out.print(letter);
        }
        System.out.println();
    }

    private static void Exercise3() {
        int num = 1000;
        ArrayList<Integer> primeNumbers = new ArrayList<Integer>();
        boolean isPrime;
        for (int i = 2; i < num; i++) {
            isPrime = true;
            for (int n = 2; n <= i / 2; n++) {
                if (i % n == 0) {
                    isPrime = false;
                }
            }
            if (isPrime) {
                primeNumbers.add(i);
            }
        }
        System.out.println("Enter a number between 1-" + primeNumbers.toArray().length);
        int n = input.nextInt();
        System.out.println(primeNumbers.get(n - 1));
    }

    private static void Exercise2() {
        ArrayList<Integer> guesses = new ArrayList<Integer>();
        int num = rand.nextInt(99) + 1;
        int index = 0;
        System.out.println("Guess the number from 1-100");
        while (!guesses.contains(num)) {
            System.out.print("Guess " + ++index + ": ");
            int guess = input.nextInt();
            input.nextLine();
            guesses.add(guess);
            if (guess > num) {
                System.out.println("Lower");
            } else if (guess < num) {
                System.out.println("Higher");
            }
        }
        System.out.print("You Got it!");
    }

    private static void Exercise1() {
        int[] num = new int[10];
        for (int i = 0; i < num.length; i++) {
            num[i] = rand.nextInt(99) + 1;
        }
        System.out.println();
        for (int singleNumber : num) {
            System.out.print(singleNumber + ", ");
        }
    }
}
