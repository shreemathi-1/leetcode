// Last updated: 7/1/2026, 7:55:41 PM
1class Solution {
2    public int totalFruit(int[] fruits) {
3        HashMap<Integer,Integer> map = new HashMap<>();
4        int left =0;
5        int max = 0 ;
6        for(int r =0;r<fruits.length;r++)
7        {
8            map.put(fruits[r],map.getOrDefault(fruits[r],0)+1);
9            while(map.size() > 2)
10            { 
11                map.put( fruits[left], map.get(fruits[left]) - 1 );
12                if(map.get(fruits[left]) == 0)
13                {
14                    map.remove(fruits[left]);
15                }
16                left++;
17            }
18            max = Math.max(max , r - left + 1);
19        }
20        return max;
21    }
22}