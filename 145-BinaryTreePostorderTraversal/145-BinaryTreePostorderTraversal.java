// Last updated: 2/13/2026, 3:16:59 PM
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
    public List<Integer> postorderTraversal(TreeNode root) 
    {
        ArrayList<Integer> l = new ArrayList<>();
       if(root==null) return new ArrayList<>();
               l.addAll(postorderTraversal(root.left ));
       l.addAll(postorderTraversal(root.right));
        l.add(root.val);
        return l;
    }
}