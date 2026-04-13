// Last updated: 4/13/2026, 9:26:05 PM
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
17    public boolean isSymmetric(TreeNode root) {
18        if (root == null) {
19            return true;
20        }
21        return isMirror(root.left, root.right);
22    }
23    
24    private boolean isMirror(TreeNode node1, TreeNode node2) {
25        if (node1 == null && node2 == null) {
26            return true;
27        }
28        if (node1 == null || node2 == null) {
29            return false;
30        }
31        return node1.val == node2.val && isMirror(node1.left, node2.right) && isMirror(node1.right, node2.left);
32    }
33}