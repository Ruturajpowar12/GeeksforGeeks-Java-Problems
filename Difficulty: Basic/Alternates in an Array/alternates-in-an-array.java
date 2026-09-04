class Solution {
    public ArrayList<Integer> getAlternates(int arr[]) {
        // Code Here
        ArrayList<Integer> li = new ArrayList<>();
        
        for(int i=0;i<arr.length;i+=2){
          li.add(arr[i]);
        }
        return li;
    }
}