class Solution {
    static boolean armstrongNumber(int n) {

        String v = String.valueOf(n);
        int len = v.length();

        int res = 0;

        for(int i = 0; i < len; i++){
            int in = Integer.parseInt(v.substring(i , i + 1));

            res += in * in * in;
        }

        if(res == n){
            return true;
        }

        return false;

    }
}