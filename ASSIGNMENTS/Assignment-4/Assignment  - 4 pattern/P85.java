class ConvergingStarPattern {
    public static void main(String[] args) {
        int n = 5; // Number of rows
        
        for(int i = 1; i <= n; i++) {
            // Print left side stars
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            
            // Print spaces in between
            for(int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            
            // Print right side stars
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            
            System.out.println();
        }
    }
}