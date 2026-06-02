// Last updated: 6/2/2026, 8:34:03 PM
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
16                char top = st.pop();
17                if(ch == ')' && top != '(' ||
18                ch == ']' && top != '[' ||
19                 ch == '}' && top != '{')
20                 {
21                    return false;
22                 }
23            }
24        }
25        return st.isEmpty();
26    }
27}