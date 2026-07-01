// Last updated: 7/1/2026, 7:50:38 PM
1class Solution {
2    public int totalFruit(int[] fruits) {
3        HashMap<Integer,Integer> map = new HashMap<>();
4        int left =0;
5        int max = 0 , count =0;
6        for(int r =0;r<fruits.length;r++)
7        {
8            map.put(fruits[r],map.getOrDefault(fruits[r],0)+1);
9            while(map.size() > 2)
10            { 
11                if(map.get(fruits[left]) == 1)
12                {
13                    map.remove(fruits[left]);
14                }
15                else
16                {
17                   map.put( fruits[left], map.get(fruits[left]) -1 );
18                }
19                left++;
20                count--;
21            }
22            count++;
23            max = Math.max(max , count);
24        }
25        return max;
26    }
27}