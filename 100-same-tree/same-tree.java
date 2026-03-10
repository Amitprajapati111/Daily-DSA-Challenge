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

//"||"ye "&&"" iske baad me hi aayega kyuki isme 2 case(ya dono null ya ek null) toh false
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        //PreOrder Traversal

        if(p == null && q == null) return true;
        if(p == null || q == null) return false; 
        if (p.val != q.val) return false;

        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        
    }
}