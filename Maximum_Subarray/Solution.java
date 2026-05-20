class Solution {
    public int maxSubArray(int[] nums) {

        int num1 = nums[0];
        int num2 = nums[0];

        for(int i = 1; i < nums.length; i++){

            num1 = Math.max(nums[i] , nums[i] + num1);
            num2 = Math.max(num1 , num2);
        }

        return num2;

    }
}