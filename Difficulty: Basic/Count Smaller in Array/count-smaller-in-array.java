
class Solution {
    public int countOfElements(int x, List<Integer> arr) {
        // code here
        
        
        int count=0;
        
       for(int val : arr){
           if(val <= x){
               count++;
           }
       }
        return count;
    }
}