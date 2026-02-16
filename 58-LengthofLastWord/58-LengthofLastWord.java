// Last updated: 2/16/2026, 9:45:21 PM
1class Solution
2{
3    public int lengthOfLastWord(String s) 
4    {
5        String[] arr = s.split(" ");
6        String last = arr[arr.length-1];
7        return last.length();
8    }
9}