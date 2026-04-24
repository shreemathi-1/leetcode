// Last updated: 4/24/2026, 7:12:52 PM
1class Solution {
2    public int strStr(String haystack, String needle) {
3        for(int i = 0, j = needle.length(); j<=haystack.length(); i++,j++){
4            if(haystack.substring(i,j).equals(needle)){
5                return i;
6            }
7        }
8        return -1;
9    }
10}