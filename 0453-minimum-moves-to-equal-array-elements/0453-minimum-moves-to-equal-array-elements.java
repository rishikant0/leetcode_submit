    class Solution {
        public int minMoves(int[] nums) {
         int count=0;
         int n = nums.length;
         Arrays.sort(nums);
         int m = nums[0];
        for(int i=1;i<n;i++) {
            count +=  nums[i]- m;
        }
        return count;

        }
    }