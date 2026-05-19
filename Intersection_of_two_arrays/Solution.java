class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        HashSet <Integer> set1 = new HashSet <>();

        for(int num : nums1) set1.add(num);

        HashSet <Integer> res = new HashSet <>();

        for(int num : nums2) {
            if(set1.contains(num)){
                res.add(num);
            }
        }

        int [] arr = new int [res.size()];
        int index = 0;
        for(int num : res) arr[index++] = num;

        return arr;

    }
}