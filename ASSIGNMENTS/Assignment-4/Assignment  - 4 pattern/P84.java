//     1
//    212
//   32123
//  4321234
// 543212345
class NumberPyramid {
    public static void main(String[] args) {
        int n = 5; // number of rows

        for (int i = 1; i <= n; i++) {
            // spaces before numbers
            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }

            // descending part
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            // ascending part (start from 2 to avoid repeating '1')
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }

            System.out.println();
        }
    }
}
