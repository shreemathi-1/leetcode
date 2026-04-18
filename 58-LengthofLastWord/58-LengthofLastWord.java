// Last updated: 4/18/2026, 5:47:06 PM
1class Solution 
2{
3    public int lengthOfLastWord(String s) 
4    {
5        String[] arr = s.split("\\s+");
6        return arr[arr.length-1].length();
7    }
8}