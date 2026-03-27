class Solution {
    static void rotateArr(int arr[], int d) {

        int count = 0;

        while(count != d) {

            int value = arr[0];
            for(int i = 0; i < arr.length - 1; i++){
                arr[i] = arr[i + 1];
            }

            arr[arr.length - 1] = value;
            count++;

        }
    }
}