class Solution {
    public int[] countOddEven(int[] arr) {
        int countOdd = 0;
        int countEven = 0;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }
        }
        
        return new int[]{countOdd, countEven};
    }
}