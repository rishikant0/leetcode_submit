class Solution {
    public void rotate(int[] arr, int k) {
        int n = arr.length;
        k %= n;
        rev(arr,0,n-1);
        rev(arr,k,n-1);
        rev(arr,0,k-1);
        
        
    }
    public void rev(int[] arr,int i,int j){
        while(i<j){
            int temp =arr[i];
          arr[i]= arr[j];
          arr[j] =temp;
          i++;
          j--;
        }
    }
}