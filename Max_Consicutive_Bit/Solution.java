class Solution {
    public int maxConsecBits(int[] arr) {

        int count = 1;
        int max = 0;

        for(int i = 0; i < arr.length - 1; i++){

            if(arr[i] == arr[i + 1]){
                count++;
            }
            else count = 1;

            if(count > max) max = count;

        }


        return max;

    }
}
