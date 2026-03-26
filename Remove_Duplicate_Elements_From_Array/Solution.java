class Solution {
    ArrayList<Integer> removeDuplicates(int[] arr) {

        HashSet <Integer> set = new HashSet<>();


        for(int i = 0; i < arr.length; i++){
            set.add(arr[i]);
        }

        ArrayList <Integer> a = new ArrayList<>(set);

        Collections.sort(a);

        return a;

    }
}
