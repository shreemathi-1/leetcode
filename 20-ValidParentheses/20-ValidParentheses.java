// Last updated: 6/10/2026, 6:12:28 PM
1class Solution {
2    public boolean isValid(String s) {
3        Stack<Character> st = new Stack<>();
4        for(char ch : s.toCharArray())
5        {
6            if(ch == '(' || ch == '{' || ch == '[')
7            {
8                st.push(ch);
9            }
10            else
11            {
12                if(st.isEmpty())
13                {
14                    return false;
15                }
16                if(ch == ')' && st.pop() != '(' 
17                || ch == '}' && st.pop() != '{'
18                || ch == ']' && st.pop() != '[' ) 
19                {
20                    return false;
21                }
22            }
23        }
24        return st.isEmpty();
25    }
26}