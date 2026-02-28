// Last updated: 2/28/2026, 7:21:49 AM
1class Solution 
2{
3    public int evalRPN(String[] tokens) 
4    {
5        Stack<Integer> st = new Stack<>();
6        // String exp = new String(tokens);
7        // StringBuilder res = new StringBuilder();
8     
9        for(String ch : tokens)
10        {
11               
12            if(ch.equals("+" )| ch.equals("-")|| ch.equals("*") || ch.equals("/"))
13            {
14                
15                int b =st.pop();
16                int a = st.pop();
17                switch(ch)
18                {
19                    case "+" : 
20                        st.push((a+b));
21                        break;
22                    case "-":
23                      st.push((a-b));
24                      break;
25                    case "*":
26                    st.push((a*b));
27                    break;
28                    case "/":
29                    st.push((a/b));
30                    break;      
31                }
32            }
33            else
34            {
35                st.push(Integer.parseInt(ch));
36            }
37        }
38        return st.pop();
39    }
40}