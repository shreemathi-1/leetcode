// Last updated: 7/19/2026, 9:24:03 AM
1class Solution {
2    public int maxNumberOfBalloons(String text) {
3        HashMap<Character,Integer> map = new HashMap<>();
4        String b = "balloon";
5        for(char ch : b.toCharArray())
6        {
7            map.put(ch , 0);
8        }
9        for(char ch : text.toCharArray())
10        {
11            if(b.contains(""+ch))
12            {
13                map.put(ch , map.get(ch)+1);
14            }
15        }
16        map.put('l',map.get('l')/2);
17        map.put('o',map.get('o')/2);
18        int min=Integer.MAX_VALUE;
19        for(char ch : map.keySet())
20        {
21            min = Math.min(min, map.get(ch));
22        }
23       
24        return min;
25    }
26}