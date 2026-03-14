public class Pattern {
    public static void main(String[] args) {

        int num = 1;               // persistent counter across all rows
        int rows = 5;              // total number of rows

        for (int i = 1; i <= rows; i++) {          // outer loop: row number
            for (int j = 1; j <= i; j++) {         // inner loop: print i numbers
                System.out.print(num);
                num++;                             // increment after every print
                if (j < i) {
                    System.out.print(" ");         // space between numbers, not after last
                }
            }
            System.out.println();                  // move to next line after each row
        }
    }
}
