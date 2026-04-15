class Solution {
    public boolean areRotations(String s1, String s2) {

        if (s1.length() != s2.length()) return false;

        for (int i = 0; i < s1.length(); i++) {

            String temp = "";

            for (int j = 0; j < s1.length(); j++) {
                temp += s1.charAt((i + j) % s1.length());
            }

            if (temp.equals(s2)) return true;
        }

        return false;
    }
}