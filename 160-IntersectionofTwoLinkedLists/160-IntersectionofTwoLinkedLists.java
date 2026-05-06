// Last updated: 5/6/2026, 11:22:12 AM
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode(int x) { val = x; }
7 * }
8 */
9class Solution 
10{
11    public void deleteNode(ListNode node) 
12    {
13        node.val = node.next.val;
14        node.next = node.next.next;
15    }
16}