// Last updated: 5/25/2026, 4:03:09 PM
1class Solution {
2    public int lastStoneWeight(int[] stones) {
3        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
4        for(int stone : stones)
5        {
6            pq.offer(stone);
7        }
8        while(pq.size() > 1)
9        {
10            int y = pq.poll();
11            int x = pq.poll();
12            if(x != y)
13            {
14                pq.offer(y-x);
15            }
16        }
17        return pq.size()==1 ? pq.peek() : 0;
18    }
19}