// Last updated: 5/6/2026, 11:19:34 AM
1public class Solution 
2{
3    public ListNode getIntersectionNode(ListNode headA, ListNode headB) 
4    {
5      ListNode h1 = headA , h2 = headB;
6      while(h1 != h2)
7      {
8            h1 = (h1 != null) ? h1.next : headA;
9            h2 = (h2 != null) ? h2.next : headB;
10      } 
11      return h1;      
12    }
13}