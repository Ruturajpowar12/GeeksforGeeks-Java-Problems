class Solution {
    public static int findMean(int[] arr) {

        int sum = 0;

        for (int num : arr) {
            sum += num;
        }

        return (int) Math.floor((double) sum / arr.length);
    }
}