// Last updated: 6/2/2026, 9:36:43 PM
1class Solution {
2    public int evalRPN(String[] tokens) {
3        Stack<Integer> st = new Stack<>();
4        int a, b;
5        for(String val : tokens)
6        {
7           
8            switch(val)
9            {
10                    case "+":
11                      b =  st.pop();
12                 a = st.pop();
13                        st.push(a+b);
14                        break;
15                    case "-":
16                      b =st.pop();
17                 a = st.pop();
18                    st.push(a-b);
19                    break;
20                    case "*":
21                      b =  st.pop();
22                 a = st.pop();
23                    st.push(a*b);
24                    break;
25                    case "/":
26                     b =  st.pop();
27                a =  st.pop();
28                    st.push(a/b);
29                    break;    
30                    default:
31                    st.push(Integer.parseInt(val) );
32                
33            }
34        }
35        return st.pop();
36    }
37}