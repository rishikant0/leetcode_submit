class Solution {
    public int maxDepth(String s) {
        int mx =0, cnt =0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '('){
                cnt++;
                mx  = Math.max(mx,cnt);
            }else if(s.charAt(i) == ')'){
                cnt--;
                mx  = Math.max(mx,cnt);
            }
        }
        return mx;
    }
}