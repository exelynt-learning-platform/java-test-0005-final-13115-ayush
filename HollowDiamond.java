public class HollowDiamond {
    public static void main(String[] args) {

        int n = 5;                        // half-size: controls diamond height
        int totalRows = 2 * n - 1;        // total rows = 9

        for (int i = 0; i < totalRows; i++) {

            // distance from the middle row (row index 4 when n=5)
            int dist = Math.abs(n - 1 - i);

            // leading spaces before the left star
            int leftSpaces  = dist;       // shrinks to 0 at middle, grows back down
            // gap between the two stars
            int innerSpaces = 2 * (n - 1 - dist) - 1;

            // print leading spaces
            for (int s = 0; s < leftSpaces; s++) {
                System.out.print(" ");
            }

            // always print the left star
            System.out.print("*");

            // print inner gap + right star only when not at a tip
            if (innerSpaces >= 0) {
                for (int s = 0; s < innerSpaces; s++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }

            System.out.println();
        }
    }
}