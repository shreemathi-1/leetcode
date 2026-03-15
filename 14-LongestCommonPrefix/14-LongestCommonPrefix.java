// Last updated: 3/15/2026, 9:36:21 PM
1class Solution {
2    public String longestCommonPrefix(String[] strs) {
3        if (strs == null || strs.length == 0) return "";
4        String prefix = strs[0];       
5        for (int i = 1; i < strs.length; i++) {
6
7            while (strs[i].indexOf(prefix) != 0) {
8                prefix = prefix.substring(0, prefix.length() - 1);
9                if (prefix.isEmpty()) return "";
10            }
11        }       
12        return prefix;
13    }
14}