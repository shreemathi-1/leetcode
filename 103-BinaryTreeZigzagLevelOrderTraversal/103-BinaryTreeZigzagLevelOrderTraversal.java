// Last updated: 5/27/2026, 11:49:40 AM
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
17    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
18        List<List<Integer>> ans = new ArrayList<>();
19        Queue<TreeNode> q = new LinkedList<>();
20        if(root == null)
21            return ans;
22        q.add(root);
23        boolean ltr = true;
24        while(!q.isEmpty())
25        {
26            int size = q.size();
27             List<Integer> l = new ArrayList<>();
28            for(int i =0;i<size;i++)
29            {
30                TreeNode node = q.poll();
31                if(ltr)
32                {
33                    l.add(node.val);
34                }
35                else
36                {
37                    l.add(0,node.val);
38                }
39                if(node.left !=null)
40                {
41                    q.add(node.left);
42                }
43                if(node.right != null)
44                {
45                    q.add(node.right);
46                }   
47            }
48          ans.add(l);
49          ltr = !ltr; 
50        }  
51        return ans;  
52    }
53}