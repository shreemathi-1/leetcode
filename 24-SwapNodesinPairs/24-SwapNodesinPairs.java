// Last updated: 5/11/2026, 9:37:42 AM
1/**
2 * Your MinStack object will be instantiated and called as such:
3 * MinStack obj = new MinStack();
4 * obj.push(val);
5 * obj.pop();
6 * int param_3 = obj.top();
7 * int param_4 = obj.getMin();
8 */
9 
10 class MinStack {
11  Stack<Integer> minSt ;
12      Stack<Integer> st;
13    public MinStack() 
14    {
15        minSt = new Stack<>();
16         st = new Stack<>();
17    }
18    
19    public void push(int val) 
20    {
21        st.push(val);
22        if(minSt.isEmpty() || val<= minSt.peek())
23        {
24          minSt.push( val );
25        }           
26    }
27    
28    public void pop() 
29    {
30       int num=  st.pop();
31       if(num == minSt.peek())
32       {
33        minSt.pop();
34       }
35    }
36    
37    public int top() {
38        return  st.peek();
39    }
40    
41    public int getMin() {
42       return  minSt.peek();
43    }
44}
45
46