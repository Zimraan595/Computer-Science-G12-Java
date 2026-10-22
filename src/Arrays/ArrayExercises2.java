package Arrays;
import java.util.Random;

public class ArrayExercises2 {
    public static Random rand = new Random();
    public static void main(String[] args) {
        //Exercise1();

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
