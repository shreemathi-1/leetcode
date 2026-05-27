// Last updated: 5/27/2026, 12:22:19 PM
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
17    public int sumNumbers(TreeNode root) {
18       return sum(root,0);  
19    }
20    int sum(TreeNode root, int current)
21    {
22        if(root == null)
23            return 0;
24
25        current = current*10 + root.val;    
26        if(root.left == null && root.right==null)
27        {
28            return current;
29        }  
30        return sum(root.left,current) + sum(root.right,current);
31    }
32}