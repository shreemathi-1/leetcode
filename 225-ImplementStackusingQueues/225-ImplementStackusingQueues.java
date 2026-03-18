// Last updated: 3/18/2026, 11:44:09 AM
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
12        st1.push(x);
13    }
14    
15    public int pop() 
16    {
17        if(st2.isEmpty())
18        {
19            while(!st1.isEmpty())
20            {
21                st2.push(st1.pop());
22            }
23            
24        }
25       
26            return st2.pop();
27        
28    }
29    
30    public int peek() {
31        if(st2.isEmpty())
32        {
33        
34            while(!st1.isEmpty())
35            {
36                st2.push(st1.pop());
37            }
38            
39        }
40        return st2.peek();
41    }
42    
43    public boolean empty() {
44        return st1.isEmpty() && st2.isEmpty();
45    }
46}
47
48/**
49 * Your MyQueue object will be instantiated and called as such:
50 * MyQueue obj = new MyQueue();
51 * obj.push(x);
52 * int param_2 = obj.pop();
53 * int param_3 = obj.peek();
54 * boolean param_4 = obj.empty();
55 */