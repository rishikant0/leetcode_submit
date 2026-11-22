class Solution {
    public boolean checkString(String s) {
        int cnt =0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a' && cnt > 0) return false;
            else if(s.charAt(i) == 'b'){
                cnt++;
            }
        }
        return true;
    }
}