// Last updated: 5/27/2026, 9:32:13 AM
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    int diameter =0;
18    public int diameterOfBinaryTree(TreeNode root) 
19    {
20        int height = height(root);
21        return diameter;
22    }
23    int height(TreeNode root)
24    {
25        if(root == null)
26        return 0;
27        int left = height(root.left);
28        int right = height(root.right);
29        diameter = Math.max(left+right,diameter);
30        return Math.max(left,right)+1; 
31    }
32}