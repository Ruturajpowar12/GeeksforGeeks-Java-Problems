
class Solution {
    /**
    * @param number[] arr

    * @returns number
    */
    largest(arr) {
        // code here
        let number = arr[0]
        
        for(let i = 1; i<arr.length;i++){
            if(number < arr[i]){
                number = arr[i]
            }
            
        }
        return number
    }
}
