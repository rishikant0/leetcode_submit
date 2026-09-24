class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> freq = new HashMap<>();

        for (int i : nums) {
            freq.put(i, freq.getOrDefault(i, 0) + 1);
        }

        for (int key : freq.keySet()) {
            if (freq.get(key) > n / 2) {
                return key;
            }
        }

        return -1;
    }
}