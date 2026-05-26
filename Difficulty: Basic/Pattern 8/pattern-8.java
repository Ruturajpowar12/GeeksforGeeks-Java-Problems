class Solution {
    public void printTriangle(int n) {

        for(int i = 1; i <= n; i++) {

            // Print spaces
            for(int j = 1; j < i; j++) {
                System.out.print(" ");
            }

            // Print stars
            for(int j = 1; j <= (2*(n-i)+1); j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}