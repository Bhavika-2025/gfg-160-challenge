//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends

class Solution {
  public:
    void nextPermutation(vector<int>& arr) {
        // Use STL function to find the next permutation
        next_permutation(arr.begin(), arr.end());
    }
};

//{ Driver Code Starts.
int main() {
    int t;
    cin >> t;
    cin.ignore(); // Ignore the newline after the integer input
    while (t--) {
        vector<int> arr;
        string input;
        getline(cin, input);
        stringstream ss(input);
        int number;
        while (ss >> number) {
            arr.push_back(number);
        }
        Solution ob;
        ob.nextPermutation(arr);
        for (int num : arr) {
            cout << num << " ";
        }
        cout << "\n";
    }
    return 0;
}
// } Driver Code Ends
