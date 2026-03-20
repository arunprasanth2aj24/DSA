class Solution {
    public int reverseNumber(int n) {

        String v = String.valueOf(n);

        String [] arr = new String [v.length()];

        for(int i = 1; i <= v.length(); i++){

            arr [v.length() - i] = v.substring(i - 1 , i);
        }

        String a = "";

        for(int i = 0; i < v.length(); i++){

            a += arr[i];

        }

        int res = new Integer (a);

        return res;





    }
}