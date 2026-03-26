class Solution {
    public int getSecondLargest(int[] arr) {

        int max = arr[0];

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }

        }


        int secLarge = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++){


            if(arr[i] > secLarge && arr[i] != max){
                secLarge = arr[i];
            }
        }

        if(secLarge == Integer.MIN_VALUE) return -1;


        return secLarge;

    }
}