import java.util.*;

class Solution {
    public int missingMultiple(int[] nums, int k) {
        // Collect multiples of k
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (num % k == 0) {
                set.add(num);
            }
        }

        // Check sequentially for the first missing multiple
        int multiple = k;
        while (true) {
            if (!set.contains(multiple)) {
                return multiple;
            }
            multiple += k;
        }
    }
}
