// Last updated: 7/8/2026, 11:58:48 PM
1class Solution {
2    public int countGoodSubstrings(String s) {
3
4        int left = 0;
5        int k = 3;
6        int count = 0;
7
8        HashMap<Character,Integer> map = new HashMap<>();
9
10        for(int r = 0; r < s.length(); r++) {
11
12            char ch = s.charAt(r);
13            map.put(ch, map.getOrDefault(ch,0)+1);
14
15            if(r - left + 1 == k){
16
17                if(map.size() == k)
18                    count++;
19
20                char leftChar = s.charAt(left);
21
22                map.put(leftChar, map.get(leftChar)-1);
23
24                if(map.get(leftChar) == 0)
25                    map.remove(leftChar);
26
27                left++;
28            }
29        }
30
31        return count;
32    }
33}