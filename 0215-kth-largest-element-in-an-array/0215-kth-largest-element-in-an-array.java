class Solution {
    public int findKthLargest(int[] nums, int k) {
         PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int num : nums) {
            minHeap.offer(num);// this is used  to add nums in minHeaps 
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }
        return minHeap.peek();

    }
}