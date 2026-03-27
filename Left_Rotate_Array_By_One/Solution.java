
class Solution {
    public void rotate(int[] arr) {

        int value = arr[arr.length - 1];
        int len = arr.length - 1;

        for(int i = len; i > 0; i--){
            arr[i] = arr[i - 1];
        }

        arr[0] = value;

    }
}