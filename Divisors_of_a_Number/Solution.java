class Solution {
    public int [] divisors(int n) {

        List <Integer> divisor = new ArrayList <> ();

        for(int i = 1; i <= n; i++){

            if(n % i == 0){
                divisor.add(i);
            }

        }

        int [] d = new int [divisor.size()];

        for(int i = 0; i < divisor.size(); i++){
            d[i] = divisor.get(i);
        }

        return d;

    }
}