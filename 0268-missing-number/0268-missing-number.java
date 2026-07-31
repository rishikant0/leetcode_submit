class Solution {
    public int missingNumber(int[] nums) {
        int sum=0;
        for(int i : nums){
            sum += i;
        }

        for(int i=1;i<=nums.length;i++){
            sum = sum -i;
        }

        return Math.abs(sum);
    }
}