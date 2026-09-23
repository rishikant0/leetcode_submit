class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
     
       int[] ans = new int[m+n];
       int i=0,j=0,k=0;

       while(m > i && n > j){
        if(nums1[i] <= nums2[j]){
          ans[k++] = nums1[i++];
          
        }else{
            ans[k++] = nums2[j++];
           
        }

       }
       while(m > i) {
        ans[k++] = nums1[i++];
      
       }

       while(n > j){
        ans[k++] = nums2[j++];
        
       }
   for(int s=0;s< m+n;s++){
    nums1[s] = ans[s];
   }


    }
}