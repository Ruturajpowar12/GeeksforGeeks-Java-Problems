// User function Template for Java
class Solution {
    public static void difference(int n1, int n2) {

        // Write your code here
        for(int i =1;i<=10;i++){
            int table1 = n1 * i;
            int table2 = n2 * i;
            
            int res = table1 - table2;
            System.out.print(res + " ");
        }
    }
}