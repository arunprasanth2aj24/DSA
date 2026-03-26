class Solution {
    public boolean isSorted(int[] arr) {

        int num = 0;

        for(int i = 0; i < arr.length - 1; i++){

            if(arr[i] > arr[i + 1]){
                return false;
            }
        }

        return true;

    }
}