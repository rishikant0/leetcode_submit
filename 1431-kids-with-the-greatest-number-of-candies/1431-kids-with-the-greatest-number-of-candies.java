import java.util.*;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans = new ArrayList<>();
        
        int maxCandies = 0;
        for (int c : candies) {
            maxCandies = Math.max(maxCandies, c);
        }
        
        for (int c : candies) {
            if (c + extraCandies >= maxCandies) {
                ans.add(true);
            } else {
                ans.add(false);
            }
        }
        
        return ans;
    }
}
