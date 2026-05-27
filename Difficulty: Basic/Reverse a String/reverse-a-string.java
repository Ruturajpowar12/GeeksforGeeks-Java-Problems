// User function Template for Java

class Solution {
    public static String reverseString(String s) {
        // code here
        StringBuilder sb = new StringBuilder(s);
        
        String rev = sb.reverse().toString();
        return rev;
    }
}