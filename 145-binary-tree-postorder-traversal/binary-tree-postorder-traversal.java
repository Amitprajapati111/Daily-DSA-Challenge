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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

        TreeNode curr = root;
        TreeNode lastvisited = null;

        while(!stack.isEmpty() || curr != null) {
            if(curr != null) {
                stack.push(curr);
                curr = curr.left;
            }
            else{
                TreeNode peekNode = stack.peek();
                if(peekNode.right != null && lastvisited != peekNode.right) {
                    curr = peekNode.right;
                }
                else{
                    result.add(peekNode.val);
                    lastvisited = stack.pop();
                }
            }

        }
        return result;
    }
}