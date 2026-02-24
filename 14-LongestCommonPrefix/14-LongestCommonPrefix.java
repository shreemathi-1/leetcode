// Last updated: 2/24/2026, 7:14:02 AM
1class Solution
2 {
3    public String longestCommonPrefix(String[] strs) 
4    {
5        if(strs.length ==0 || strs == null) return "";
6        String first = strs[0];
7       for(int i =0;i<first.length();i++)
8       {
9        char ch = first.charAt(i);
10        for(int j =1;j<strs.length;j++)
11        {
12                if( i == strs[j].length() ||  strs[j].charAt(i) != ch)
13                {
14                    return first.substring(0,i);
15                }
16        }
17       }
18       return first;
19    }
20}