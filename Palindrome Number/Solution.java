class Solution {
    public boolean isPalindrome(int n) {

        String orginal = String.valueOf(n);

        String reversed = "";


        for(int i = orginal.length(); i > 0 ; i--){

            reversed += orginal.substring(i - 1 , i);

        }

        if(orginal.equals(reversed)){
            return true;
        }

        return false;

    }
}