import java.util.ArrayList;
import java.util.Scanner;

public class AlgorithmCompetition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = 1000000;
        ArrayList<Integer> primeNumbers = new ArrayList<Integer>();
        boolean isPrime;

        long start = System.nanoTime();
        for (int i = 2; i < num; i++) {
            isPrime = true;
            if (i % 2 == 0) {
                isPrime = false;
            } else {
                for (int n = 3; n * n <= i; n += 2) {
                    if (i % n == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }
            if (isPrime) {
                primeNumbers.add(i);
            }
        }
        long end = System.nanoTime();
        long elapsed = end - start;

        System.out.println(primeNumbers + "\n\nCompleted in " + elapsed/1000000.0 + " ms");

        adit();
    }

    public static void adit() {
        int limit = 1_000_000;
        int expectedCount = 78_498;
        int primeCount = 0;
        boolean isPrime = true;

        // --- TIMING STARTS ---
        long startTime = System.nanoTime();



        primeCount = 1;

        for(int i = 3; i <= limit; i+=2){

            int j = 2;

            while((j * j) <= i){
                if(i % j == 0){
                    isPrime = false;
                    break;
                }
                j = 2 + (j - 1);
            }

            if(isPrime == true){
                primeCount += 1;
            }

            isPrime = true;
        }



        long elapsedTime = System.nanoTime() - startTime;

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
