// Last updated: 4/15/2026, 9:06:37 PM
1class Solution 
2{
3    public String longestCommonPrefix(String[] strs) 
4    {
5        if(strs.length ==0)
6    return "";
7        String pre = strs[0];
8        for(int i =1;i<strs.length;i++)
9        {
10            while(strs[i].indexOf(pre) != 0)
11            {
12                pre = pre.substring(0,pre.length()-1);
13            }
14        }
15        return pre;
16    }
17}