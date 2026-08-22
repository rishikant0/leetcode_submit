class Solution {
    public boolean checkDivisibility(int n) {
        int sum =0;
        int pro = 1;
        int m = n;
        while(n > 0){
            int digit = n%10;
            n /= 10;
            sum += digit ;
            pro *= digit;
        }


        int summ = sum + pro;
        if(m % summ == 0) return true;
        return false;
    }
}