// Last updated: 4/6/2026, 6:49:28 PM
1class Solution 
2{
3    public int longestValidParentheses(String s) 
4    {
5        Stack<Integer> st = new Stack<>();
6        int maxLen =0;
7        st.push(-1);
8        for(int i =0;i<s.length();i++)
9        {
10            char ch = s.charAt(i);
11            if(ch =='(')
12            {
13                st.push(i);
14            }
15            else
16            {
17                st.pop();
18                if(st.isEmpty())
19                {
20                    st.push(i);
21                }
22                else
23                {
24                    maxLen = Math.max(maxLen,i-st.peek());
25                }
26            }
27        }
28        return maxLen;
29    }
30}