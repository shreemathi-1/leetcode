// Last updated: 3/18/2026, 11:56:10 AM
1class MyQueue {
2
3    Stack<Integer> st1 ;
4    Stack<Integer> st2;
5    public MyQueue() {
6        st1 = new Stack<>();
7        st2 = new Stack<>();
8    }
9    
10    public void push(int x) 
11    {
12        while(!st1.isEmpty())
13        {
14            st2.push(st1.pop());
15        }
16        st1.push(x);
17        while(!st2.isEmpty())
18        {
19            st1.push(st2.pop());
20        }
21    }
22    
23    public int pop() 
24    {
25        
26            return st1.pop();  
27    }
28    
29    public int peek() {
30        
31        return st1.peek();
32    }
33    
34    public boolean empty() {
35        return st1.isEmpty() ;
36    }
37}
38
39/**
40 * Your MyQueue object will be instantiated and called as such:
41 * MyQueue obj = new MyQueue();
42 * obj.push(x);
43 * int param_2 = obj.pop();
44 * int param_3 = obj.peek();
45 * boolean param_4 = obj.empty();
46 */