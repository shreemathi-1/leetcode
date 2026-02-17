// Last updated: 2/17/2026, 6:52:26 PM
1class Solution 
2{
3    public String reverseWords(String s) 
4    {
5        String[] arr = s.trim().split("\\s+");
6        StringBuilder sb = new StringBuilder();
7        for(int i =arr.length-1;i>=0;i--)
8        {
9           if(i==0) sb.append( arr[i]) ;
10           else  sb.append(arr[i]).append(" ");
11        }
12        return sb.toString() ;
13    }
14}