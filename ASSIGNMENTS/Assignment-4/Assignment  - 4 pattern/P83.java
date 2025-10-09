class Test {
    public static void main(String[] args) {
        int n = 8; // number of lines inside the box

        // Top border
        for (int i = 0; i < n + 1; i++) {
            System.out.print("-");
        }
        System.out.println();

        // Middle part
        for (int i = 0; i < n; i++) {
            System.out.print("|"); // left border
            for (int j = 0; j < n; j++) {
                if (j == i) 
                    System.out.print("\\");  // left diagonal
                else if (j == n - 1 - i) 
                    System.out.print("/");  // right diagonal
                else 
                    System.out.print(" ");  // spaces
            }
            System.out.println("|"); // right border
        }

        // Bottom border
        for (int i = 0; i < n + 1; i++) {
            System.out.print("-");
        }
    }
}
