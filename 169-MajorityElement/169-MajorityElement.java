// Last updated: 6/10/2026, 9:40:05 PM
1class Solution {
2    public int majorityElement(int[] nums) {
3        int maj =0, c=0;
4        for(int num : nums)
5        {
6            if(c==0)
7            {
8                maj = num;
9            }
10            if(num == maj)
11                c++;
12            else
13                c--;    
14        }
15        int freq = 0;
16        for(int num : nums)
17        {
18            if(num == maj)
19                freq++;
20        }
21        if(freq > nums.length/2)
22            return maj;
23        else 
24            return -1;
25    }
26}