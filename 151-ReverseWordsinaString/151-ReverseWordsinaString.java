// Last updated: 3/9/2026, 7:40:29 PM
1class Solution 
2{
3    public String reverseWords(String s) 
4    {
5        String[] arr = s.trim().split("\\s+");
6        StringBuilder sb = new StringBuilder();
7        for(int i = arr.length-1;i>=0;i--)
8        {
9            if(i==0)
10            sb.append(arr[i]);
11            else
12            sb.append(arr[i]).append(" ");
13            
14        }
15        return sb.toString();
16    }
17}