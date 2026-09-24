class Solution {
    public int removeDuplicates(int[] nums) {
        int i =0; // pointer
        int k =0; // second pointer count for new array
        int cnt =0; ///count 
        int zero = 0;
        nums[k++] = nums[i++];
            cnt++;
            zero++;
        while(nums.length > i ){
      if(nums[i-1] != nums[i]){
        zero  =0;
        nums[k++] = nums[i++];
        cnt++;
        zero++;
      }else if(zero < 2){
        nums[k++] = nums[i++];
        cnt++;
        zero++;
      }else{
        i++;
        
      }
        }
        return cnt;
    }
}