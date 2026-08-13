// Last updated: 8/13/2026, 10:08:31 PM
1class Solution {
2
3    public boolean isValidBST(TreeNode root) {
4
5        return check(root, Long.MIN_VALUE, Long.MAX_VALUE);
6    }
7
8    public boolean check(TreeNode root, long min, long max) {
9
10        if (root == null) {
11            return true;
12        }
13
14        // Current node violates BST property
15        if (root.val <= min || root.val >= max) {
16            return false;
17        }
18
19        // Validate left subtree
20        boolean left = check(root.left, min, root.val);
21
22        // Validate right subtree
23        boolean right = check(root.right, root.val, max);
24
25        return left && right;
26    }
27}