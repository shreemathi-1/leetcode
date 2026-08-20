// Last updated: 8/20/2026, 11:07:21 PM
1class Solution {
2    public String reverseWords(String s) {
3        String[] strs = s.trim().split("\\s+");
4        StringBuilder sb = new StringBuilder();
5        for(int i = strs.length-1;i>=0;i--)
6        {
7            sb.append(strs[i]);
8            if(i != 0)
9            {
10                sb.append(" ");
11            }
12        }
13        return sb.toString();
14    }
15}