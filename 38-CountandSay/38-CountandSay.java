// Last updated: 4/24/2026, 7:38:55 PM
1class Solution {
2    public boolean isIsomorphic(String s, String t) {      
3        int[] indexS = new int[200]; 
4        int[] indexT = new int[200]; 
5        int len = s.length();
6        if(len != t.length()) {
7            return false;
8        }
9        for(int i = 0; i < len; i++) 
10        {
11            if(indexS[s.charAt(i)] != indexT[t.charAt(i)]) 
12            {
13                return false; 
14            }
15            indexS[s.charAt(i)] = i + 1; 
16            indexT[t.charAt(i)] = i + 1;
17        }
18        return true;
19    }
20}