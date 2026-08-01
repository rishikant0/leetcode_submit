class Solution {
    public int[] rearrangeArray(int[] nums) {
        ArrayList<Integer> ansP = new ArrayList<>();
        ArrayList<Integer> ansN = new ArrayList<>(); 
         for (int num : nums) {
            if (num >= 0) {
                ansP.add(num);
            } else {
                ansN.add(num);
            }
        }

        int pIndex = 0, nIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                nums[i] = ansP.get(pIndex++);
            } else {
                nums[i] = ansN.get(nIndex++);
            }
        }

        return nums;
    }
}