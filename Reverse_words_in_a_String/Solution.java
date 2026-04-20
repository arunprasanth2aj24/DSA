class Solution {
    public String reverseWords(String s) {

        String [] w = s.split(" ");

        String ans = "";

        for(int i = w.length - 1; i >= 0; i--){

            if(!w[i].equals("")){
                if(ans.equals("")){
                    ans = w[i];
                }
                else{
                    ans = ans + " " + w[i];
                }
            }
        }

        return ans;

    }
}