// Last updated: 2/21/2026, 9:09:26 PM
1class MyQueue {
2 Stack<Integer> st1 ;
3 Stack<Integer> st2 ;
4    public MyQueue() 
5    {
6       st1 =  new Stack<>();
7       st2 = new Stack<>();
8    }
9    
10    public void push(int x) {
11       
12            st1.push(x);
13        
14    }
15    
16    public int pop() {
17        if(st2.isEmpty())
18        {
19            while(!st1.isEmpty())
20            {
21                st2.push(st1.pop());
22            }
23            
24        }
25        return st2.pop();
26    }
27    
28    public int peek() {
29        while(st2.isEmpty())
30        {
31            while(!st1.isEmpty())
32            {
33                st2.push(st1.pop());
34            }
35        }
36        return st2.peek();
37           
38    }
39    
40    public boolean empty() {
41        return st1.isEmpty() && st2.isEmpty();
42    }
43}
44
45/**
46 * Your MyQueue object will be instantiated and called as such:
47 * MyQueue obj = new MyQueue();
48 * obj.push(x);
49 * int param_2 = obj.pop();
50 * int param_3 = obj.peek();
51 * boolean param_4 = obj.empty();
52 */