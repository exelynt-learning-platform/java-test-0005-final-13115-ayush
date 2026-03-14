public class BinaryTriangle {
    public static void main(String[] args) {

        int rows = 6;

        for (int i = 1; i <= rows; i++) {              // outer loop: each row
            for (int j = 1; j <= i; j++) {             // inner loop: j values per row
                if ((i + j) % 2 == 0) {
                    System.out.print(1);               // even sum → print 1
                } else {
                    System.out.print(0);               // odd sum  → print 0
                }
                if (j < i) {
                    System.out.print(" ");             // space between numbers only
                }
            }
            System.out.println();                      // move to next line
        }
    }
}