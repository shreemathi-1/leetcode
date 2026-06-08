// Last updated: 6/8/2026, 7:41:17 AM
1class Solution 
2{
3    public int[] maxSlidingWindow(int[] nums, int k) 
4    {
5        Deque<Integer> dq = new ArrayDeque<>();
6        int[] res = new int[nums.length -k +1];
7        int ind =0;
8        for(int i =0;i<nums.length;i++)
9        {
10            while(!dq.isEmpty() && dq.peekFirst() <= i-k)
11            {
12                dq.pollFirst();
13            }
14            while(!dq.isEmpty() && nums[dq.peekLast()] < nums[i])
15            {
16                dq.pollLast();
17            }
18            dq.offerLast(i);
19            if(i >= k-1)
20            {
21                res[ind++] = nums[dq.peekFirst()];
22            }
23        }
24        return res;
25    }
26}