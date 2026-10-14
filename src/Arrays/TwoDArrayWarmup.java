package Arrays;

public class TwoDArrayWarmup {
    public static void main(String[] args) {
        int[][] rents = {
                {400, 550, 600},
                {500, 525, 640},
                {425, 475, 750},
                {635, 490, 510}
        };

        System.out.println("Jan\tFeb\tMarch");
        for (int[] rentPerQuarter : rents) {
            for (int rent : rentPerQuarter) {
                System.out.print(rent + "\t");
            }
            System.out.println();
        }

//        System.out.println("Jan\tFeb\tMarch");
//        for (int[] roe : rents) {
//            for (int rent : rentPerQuarter) {
//                System.out.print(rent + "\t");
//            }
//            System.out.println();
//        }
    }
}
