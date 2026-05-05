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
    // public List<Integer> preorderTraversal(TreeNode root) {
    //     List<Integer> sol = new ArrayList<>();
    //     preOrder(root,sol);
    //     return sol;
    // }
    // void preOrder(TreeNode root, List<Integer> sol){
    //     if(root==null)return;

    //     sol.add(root.val);
    //     preOrder(root.left,sol);
    //     preOrder(root.right,sol);

    // }
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> List = new ArrayList<>();
        if(root==null)return List;
        List.add(root.val);
        List.addAll(preorderTraversal(root.left));
        List.addAll(preorderTraversal(root.right));

        return List;
    }
}