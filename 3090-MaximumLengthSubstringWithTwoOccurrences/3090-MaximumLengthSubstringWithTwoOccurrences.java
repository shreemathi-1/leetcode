// Last updated: 8/14/2026, 11:58:40 AM
1class Solution {
2    public boolean isGood(int[] nums) {
3        int n = nums.length;
4        int max = 0;
5        HashSet<Integer> set = new HashSet<>();
6        for(int i =0;i<n;i++)
7        {
8            max = Math.max(max,nums[i]);
9            set.add(nums[i]);
10        }
11        int count = 0;
12        for(int i =0;i<n;i++)
13        {
14            if(nums[i] == max)
15            {
16                count++;
17            }
18        }
19        if(n != max+1)
20        {
21            return false;
22        }
23        else
24        {
25           
26            for(int i =1;i<n;i++)
27            {
28             
29                if(!set.contains(i))
30                {
31                    return false;
32                }
33            }
34           
35            
36        }
37         if(count == 2)
38            {
39                return true;
40            }
41        return false;
42    }
43}