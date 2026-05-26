// User function Template for Java
class Solution {
    static void printPattern(int N) {
        
        for(int i = 1; i <= N; i++) {
            
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            
            if(i != N) {
                System.out.print(" ");
            }
        }
    }
}