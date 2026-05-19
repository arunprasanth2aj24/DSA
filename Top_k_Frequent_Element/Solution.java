import java.util.ArrayList;
import java.util.HashMap;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        ArrayList<Integer>[] arr = new ArrayList[nums.length];

        for (int i : map.keySet()) {

            if (arr[map.get(i) - 1] == null) {
                arr[map.get(i) - 1] = new ArrayList<Integer>();
            }
            arr[map.get(i) - 1].add(i);
        }

        int [] arrk = new int[k];
        int index = 0;

        l:
        for (int i = arr.length - 1; i >= 0; i--) {

            if (arr[i] != null) {

                for (int j : arr[i]) {

                    if(index < k - 1) {
                        arrk[index] = j;
                        index++;
                    }
                    else {
                        arrk[index] = j;
                        break l;
                    }

                }
            }
        }
        return arrk;
    }
}
