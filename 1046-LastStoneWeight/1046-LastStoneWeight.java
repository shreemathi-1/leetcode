// Last updated: 5/25/2026, 4:09:21 PM
1class Solution {
2    public int findKthLargest(int[] nums, int k) {
3        PriorityQueue<Integer> pq = new PriorityQueue<>();
4        for(int num : nums)
5        {
6              pq.offer(num);
7            if(pq.size() > k)
8            {
9                pq.poll();
10            } 
11        }
12        return pq.poll();
13    }
14}