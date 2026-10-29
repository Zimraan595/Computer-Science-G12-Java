import java.util.ArrayList;
import java.util.Scanner;

public class AlgorithmCompetition {
    public static void main(String[] args) {
        int limit = 1_000_000;
        int expectedCount = 78_498;
        int primeCount = 0;

        // --- TIMING STARTS ---
        long startTime = System.nanoTime();



        // --- TIMING ENDS ---
        long elapsedTime = System.nanoTime() - startTime;

        // Verification and Results
        System.out.println("Your Count: " + primeCount);
        if (primeCount == expectedCount) {
            System.out.println("Result: CORRECT!");
            double milliseconds = elapsedTime / 1_000_000.0;
            System.out.printf("Time taken: %,d ns (%.3f ms)%n", elapsedTime, milliseconds);
        } else {
            System.out.println("Result: INCORRECT (Expected " + expectedCount + ")");
        }
    }
}
