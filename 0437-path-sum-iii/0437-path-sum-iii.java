/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
int count;
    public int pathSum(TreeNode root, int targetSum) {
        if(root == null) return 0;
        path(root, 0L, targetSum);
        pathSum(root.left,targetSum);
        pathSum(root.right,targetSum);
        return count;
    }

    private void path(TreeNode root, long sum, int targetsum){
        if(root == null) return;
        sum += root.val;
        if(targetsum == sum){
            count++;
        }
        path(root.left , sum , targetsum);
        path(root.right, sum , targetsum);        
    }
}