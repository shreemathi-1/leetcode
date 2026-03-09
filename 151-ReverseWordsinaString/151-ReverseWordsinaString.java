// Last updated: 3/9/2026, 7:36:14 PM
1class Solution 
2{
3    public String reverseWords(String s) 
4    {
5        String[] arr = s.split("\\s+");
6        StringBuilder sb = new StringBuilder();
7        for(int i = arr.length-1;i>=0;i--)
8        {
9            sb.append(arr[i]).append(" ");
10            
11        }
12        return sb.toString().trim();
13    }
14}