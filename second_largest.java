class Solution {
    public int getSecondLargest(int[] arr) {

        int n = arr.length;    

 \\sorting array in ascending order
        Arrays.sort(arr);     

// start from second last element as last element is the largest
        for(int i=n-2;i>=0;i--){

// return the first element which is not equal to the largest element
            if(arr[i] != arr[n-1]){
            return arr[i];
            }
        }
        return -1;
    }
}
