// Last updated: 3/25/2026, 10:15:37 AM
1/*
2// Definition for a Node.
3class Node {
4    public int val;
5    public Node prev;
6    public Node next;
7    public Node child;
8};
9*/
10
11class Solution {
12    public Node flatten(Node head) 
13    {
14        if(head == null)
15        {
16            return null;
17        }
18        Node cur = head;
19        while(cur != null)
20        {
21            if(cur.child != null)
22            {
23                Node up = cur.next;
24                cur.next = flatten(cur.child);
25                cur.next.prev = cur;
26                cur.child =null;
27                while(cur.next != null)
28                {
29                    cur = cur.next;
30                }
31                if(up != null)
32                {
33                    cur.next = up;
34                    up.prev = cur;
35                }
36            }
37            cur = cur.next;
38        }
39        return head;
40    }
41}