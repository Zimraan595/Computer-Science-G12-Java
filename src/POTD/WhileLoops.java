package POTD;

public class WhileLoops {
    static void main() {
        int x = 0;
        while (x < 5) {
            System.out.println(++x);
        }

        System.out.println("------------------------------------------------");

        x = 0;
        do {
            System.out.println(++x);
        } while (x < 5);

        System.out.println("------------------------------------------------");

        for (int i=1; i <= 5; i++){
            System.out.println(i);
        }

    }
}
