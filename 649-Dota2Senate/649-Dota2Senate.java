// Last updated: 5/25/2026, 11:42:24 AM
1class Solution {
2    public String predictPartyVictory(String senate) {
3        Queue<Integer> radiant = new LinkedList<>();
4        Queue<Integer> dire = new LinkedList<>();
5        int n = senate.length();
6        for(int i =0;i<n;i++)
7        {
8            if(senate.charAt(i) == 'R')
9            {
10                radiant.offer(i);
11            }
12            else
13            {
14                dire.offer(i);
15            }
16        }
17        while(!radiant.isEmpty() && !dire.isEmpty())
18        {
19            int r = radiant.poll();
20            int d = dire.poll();
21            if(r<d)
22            {
23                radiant.offer(r+n);
24            }
25            else
26            {
27                dire.offer(d+n);
28            }
29        }
30        return radiant.isEmpty() ? "Dire" : "Radiant";
31    }
32}