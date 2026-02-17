// Last updated: 2/17/2026, 6:45:53 PM
1class Solution 
2{
3    public String reverseWords(String s) 
4    {
5        String[] arr = s.trim().split("\\s+");
6        String res = "";
7        for(int i =arr.length-1;i>=0;i--)
8        {
9           if(i==0) res += arr[i] ;
10           else res += arr[i] + " ";
11        }
12        return res ;
13    }
14}