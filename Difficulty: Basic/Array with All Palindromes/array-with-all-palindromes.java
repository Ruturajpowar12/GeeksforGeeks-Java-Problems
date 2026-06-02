class Solution {
    public static boolean isPalinArray(int[] arr) {
        
        
        for (int i = 0; i < arr.length; i++) {
            if (!isPalindrome(arr[i])) {
                return false;
            }
        }
        return true;
    }

    private static boolean isPalindrome(int num) {
        int original = num;
        int reversed = 0;

        while (num > 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num = num / 10;
        }

        return original == reversed;
    }
}