// Last updated: 3/18/2026, 11:33:58 AM
1// class MyStack {
2
3// Queue<Integer> q1;
4// Queue<Integer> q2;
5//     public MyStack() {
6//         q1 = new LinkedList<>();
7//         q2 = new LinkedList<>();
8//     }
9    
10//     public void push(int x) {
11//         if(q1.isEmpty())
12//         {
13//             q1.offer(x);
14//         }
15//         else
16//         {
17//             while(!q1.isEmpty())
18//             {
19//                q2.offer( q1.poll());
20//             }
21//             q1.offer(x);
22//             while(!q2.isEmpty())
23//             {
24//                 q1.offer(q2.poll());
25//             }
26//         }
27//     }
28    
29//     public int pop() {
30//         return q1.poll();
31//     }
32    
33//     public int top() {
34//         return q1.peek();
35//     }
36    
37//     public boolean empty() {
38//         return q1.isEmpty();
39//     }
40// }
41
42// /**
43//  * Your MyStack object will be instantiated and called as such:
44//  * MyStack obj = new MyStack();
45//  * obj.push(x);
46//  * int param_2 = obj.pop();
47//  * int param_3 = obj.top();
48//  * boolean param_4 = obj.empty();
49//  */
50
51class MyStack
52{
53
54Queue<Integer> q;
55
56    public MyStack() {
57        q = new LinkedList<>();
58       
59    }
60    
61    public void push(int x) {
62             q.offer(x);
63           for(int i =0;i<q.size()-1;i++)
64            {
65               q.offer( q.poll());
66            }
67        
68    }
69    
70    public int pop() {
71        return q.poll();
72    }
73    
74    public int top() {
75        return q.peek();
76    }
77    
78    public boolean empty() {
79        return q.isEmpty();
80    }
81}
82