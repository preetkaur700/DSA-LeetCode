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
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> sol = new ArrayList<>();
        inOrder(root,sol);
        return sol;
    }
    void inOrder(TreeNode root,ArrayList<Integer>sol){
        if(root==null)return;

        inOrder(root.left,sol);
        sol.add(root.val);
        inOrder(root.right,sol);
    }
}