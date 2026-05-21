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
    ArrayList<Integer>list=new ArrayList<>();
    public void inorder(TreeNode root){
        if(root==null)return ;
        inorder(root.left);
        list.add(root.val);
        inorder(root.right);
    }
    public TreeNode sort(int start,int end){
        int mid=start+(end-start)/2;
        if(start>end)return null;

        TreeNode root=new TreeNode(list.get(mid));
        root.left=sort(start,mid-1);
        root.right=sort(mid+1,end);
        return root;
    }
    public TreeNode balanceBST(TreeNode root) {
        inorder(root);
        return sort(0,list.size()-1);
    }
}