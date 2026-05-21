class Solution {
    public int[] rearrangeArray(int[] nums) {

        int [] arr = new int [nums.length];

        int pIndex = 0;
        int nIndex = 1;

        for(int i = 0; i < nums.length; i++){

            if(nums[i] < 0){
                arr[nIndex] = nums[i];
                nIndex += 2;
            }
            else{
                arr[pIndex] = nums[i];
                pIndex += 2;
            }
        }

        return arr;

    }
}