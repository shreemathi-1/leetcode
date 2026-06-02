// Last updated: 6/2/2026, 8:52:10 PM
1class Solution 
2{
3    public int longestValidParentheses(String s) 
4    {
5        Stack<Integer> st = new Stack<>();
6        st.push(-1);
7        int maxLen = 0;
8        for(int i =0;i<s.length();i++)
9        {
10            if(s.charAt(i) == '(')
11            {
12                st.push(i);
13            }
14            else
15            {
16                st.pop();
17                if(st.isEmpty())
18                {
19                    st.push(i);
20                }
21                else
22                {
23                    maxLen= Math.max(maxLen, i - st.peek());
24                }
25            }
26        }
27        return maxLen;
28    }
29}