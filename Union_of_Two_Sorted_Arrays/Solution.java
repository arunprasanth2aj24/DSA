class Solution {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {

        HashSet <Integer> set = new HashSet <Integer>();

        for(int j = 0; j < a.length; j++){
            set.add(a[j]);
        }

        for(int k = 0; k < b.length; k++){
            set.add(b[k]);
        }

        ArrayList <Integer> res = new ArrayList<>(set);
        Collections.sort(res);

        return res;
    }
}
