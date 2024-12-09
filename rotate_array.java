class Solution {
    // Function to rotate an array by d elements in counter-clockwise direction.
    static void rotateArr(int arr[], int d) {
        // add your code here
        
        // int n = arr.length;
  
        // // Repeat the rotation d times
        // for (int i = 0; i < d; i++) {
          
        //     // Left rotate the array by one position
        //     int first = arr[0];
        //     for (int j = 0; j < n - 1; j++) {
        //         arr[j] = arr[j + 1];
        //     }
        //     arr[n - 1] = first;
        int n = arr.length;

        // Handle case when d > n
        d %= n;
        
        // Storing rotated version of array
        int[] temp = new int[n];

        // Copy last n - d elements to the front of temp
        for (int i = 0; i < n - d; i++)
            temp[i] = arr[d + i];

        // Copy the first d elements to the back of temp
        for (int i = 0; i < d; i++)
            temp[n - d + i] = arr[i];

        // Copying the elements of temp in arr
        // to get the final rotated array
        for (int i = 0; i < n; i++)
            arr[i] = temp[i];
    }
}
