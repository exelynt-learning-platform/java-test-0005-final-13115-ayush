public class MirroredPyramid {
    public static void main(String[] args) {

        int rows = 5;

        for (int i = 1; i <= rows; i++) {

            // Part 1: print leading spaces (rows - i) spaces
            for (int s = 1; s <= rows - i; s++) {
                System.out.print("  ");           // 2 spaces per indent level
            }

            // Part 2: ascending — print 1 to i
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            // Part 3: descending mirror — print i-1 down to 1
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j + " ");
            }

            System.out.println();                 // move to next line
        }
    }
}