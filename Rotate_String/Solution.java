class Solution {
    public boolean rotateString(String s, String goal) {

        boolean rval = false;

        if(s.length() != goal.length()) return rval;

        String res = s + s;

        if(res.contains(goal)) rval = true;

        return rval;

    }
}