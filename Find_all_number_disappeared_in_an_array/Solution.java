class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {

        boolean [] in = new  boolean [nums.length + 1];

        for(int i = 0; i < nums.length; i++){

            in[nums[i]] = true;

        }

        ArrayList <Integer> arr = new ArrayList <>();

        for(int i = 1; i <= nums.length; i++){

            if(!in[i]){
                arr.add(i);
            }
        }


        return arr;
    }
}