// User function Template for Java
class Solution {
    public static void triangleWall(int s) {

        // Write your code here
         for(int i = 1; i <= s; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
           System.out.println(); 
        }
    }
}