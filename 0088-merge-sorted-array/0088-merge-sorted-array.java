class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p = 0;
        int[] num3 = new int[m+n];
        int i=0;
        int j=0;
        while(i<m && j<n){
         if(nums1[i]<nums2[j]){
            num3[p++] = nums1[i++];
           
         }else{
            num3[p++] = nums2[j++];
            
         }
        }
        while(i<m){
            num3[p++] = nums1[i++];
        }

         while(j<n){
            num3[p++] = nums2[j++];
        }

        for(int r=0;r<p;r++){
            nums1[r] = num3[r];
        }


    }
}