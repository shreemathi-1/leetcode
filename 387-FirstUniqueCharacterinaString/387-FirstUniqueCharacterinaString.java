// Last updated: 3/16/2026, 1:39:06 PM
1class Solution 
2{
3    public int firstUniqChar(String s) 
4    {
5       
6        HashMap<Character,Integer> map = new LinkedHashMap<>();
7        for(int i =0;i<s.length();i++)
8        {
9           map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
10        }
11        for(int i =0;i<s.length();i++)
12        {
13            if(map.get(s.charAt(i)) ==1)
14            return i;
15        }
16       
17        return -1;
18    }
19}