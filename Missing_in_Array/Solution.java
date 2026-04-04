class Solution {
    int missingNum(int arr[]) {

        int n = arr.length + 1;
        int[] FreqArr = new int[n + 1];


        for (int i = 0; i < arr.length; i++) {
            FreqArr[arr[i]]++;
        }


        for (int i = 1; i <= n; i++) {
            if (FreqArr[i] == 0) {
                return i;
            }
        }

        return -1;
    }
}
