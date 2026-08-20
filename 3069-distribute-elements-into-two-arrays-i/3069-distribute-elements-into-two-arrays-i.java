import java.util.*;

class Solution {
    public int[] resultArray(int[] nums) {
        List<Integer> ans1 = new ArrayList<>();
        List<Integer> ans2 = new ArrayList<>();

        ans1.add(nums[0]);
        ans2.add(nums[1]);

        for (int k = 2; k < nums.length; k++) {
            if (ans1.get(ans1.size() - 1) > ans2.get(ans2.size() - 1)) {
                ans1.add(nums[k]);
            } else {
                ans2.add(nums[k]);
            }
        }

       
        ans1.addAll(ans2);

       
        int[] result = new int[ans1.size()];
        for (int i = 0; i < ans1.size(); i++) {
            result[i] = ans1.get(i);
        }
        return result;
    }
}
