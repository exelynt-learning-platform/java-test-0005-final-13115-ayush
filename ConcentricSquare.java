public class ConcentricSquare {
    public static void main(String[] args) {

        int n = 4;                          // outermost number / layer count
        int size = 2 * n - 1;              // grid is 7×7 when n=4

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {

                // distance from each of the 4 edges
                int top    = i;
                int left   = j;
                int bottom = (size - 1) - i;
                int right  = (size - 1) - j;

                // closest edge distance = layer depth from outside
                int minDist = Math.min(Math.min(top, bottom), Math.min(left, right));

                // value counts DOWN from n as we go inward
                int value = n - minDist;

                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}