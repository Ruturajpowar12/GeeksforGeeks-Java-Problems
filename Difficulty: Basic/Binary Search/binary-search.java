class Solution {
    public boolean binarySearch(int[] arr, int k) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == k) {
                return true;
            } 
            else if (arr[mid] < k) {
                start = mid + 1;
            } 
            else {
                end = mid - 1;
            }
        }

        return false;
    }
}