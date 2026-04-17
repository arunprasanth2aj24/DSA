class Solution {

    public int longestConsecutive(int[] arr) {

        HashSet <Integer> set = new HashSet <>();

        for(int i = 0; i < arr.length; i++){

            set.add(arr[i]);
        }

        int longest = 0;

        for(int i = 0; i < arr.length; i++){


            int current = arr[i];
            int streak = 1;


            while(set.contains(current)){

                current++;
                streak++;
            }

            longest = Math.max(longest , streak - 1);
        }

        return longest;

    }
}