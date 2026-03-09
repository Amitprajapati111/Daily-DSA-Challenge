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
    public int diameterOfBinaryTree(TreeNode root) {
        int maxNode[] = new int[1];
        getHeight(root, maxNode);
        return maxNode[0];    
    }
    public int getHeight(TreeNode root, int[] maxNode) {
        if(root == null) {
            return 0;
        }
        int leftheight = getHeight(root.left, maxNode);
        int rightheight = getHeight(root.right, maxNode);
        maxNode[0] = Math.max(maxNode[0], leftheight + rightheight);
        return 1 + Math.max(leftheight , rightheight);
    }
}