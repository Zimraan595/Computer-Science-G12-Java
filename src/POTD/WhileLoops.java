package POTD;

public class WhileLoops {
    static void main() {
        int x = 0;
        while (x < 5) {
            System.out.println(++x);
        }

        x = 0;
        do {
            System.out.println(++x);
        } while (x < 5);

    }
}
