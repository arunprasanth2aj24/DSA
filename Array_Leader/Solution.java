class Solution {
    static ArrayList<Integer> leaders(int arr[]) {

        ArrayList <Integer> nums = new ArrayList <>();

        int rightMost = arr[arr.length - 1];

        nums.add(rightMost);

        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] >= rightMost) {
                rightMost = arr[i];
                nums.add(rightMost);
            }
        }

        Collections.reverse(nums);

        return nums;

    }
}
