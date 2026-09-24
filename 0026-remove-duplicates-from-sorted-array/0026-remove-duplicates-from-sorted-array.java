class Solution {
    public int removeDuplicates(int[] nums) {
        int cnt =1, i =0;
              int k =0;
          nums[k++] = nums[i++];
             
         while(nums.length > i){
           if(nums[i-1] != nums[i]){
            nums[k++] = nums[i++];
       
            cnt++;
           }else{
            i++;
           }
        }
 
    
        return cnt;
    }
}