class Solution {
    public boolean isIsomorphic(String s, String t) {

        if(s.length() != t.length()) return false;

        HashMap <Character , Character> map = new HashMap <>();

        for(int i = 0; i < s.length(); i++){

            char og = s.charAt(i);
            char rp = t.charAt(i);

            if(!map.containsKey(og)){
                if(!map.containsValue(rp)){

                    map.put(og , rp);

                } else return false;

            }
            else{
                if(map.get(og) != rp) return false;
            }

        }

        return true;

    }
}