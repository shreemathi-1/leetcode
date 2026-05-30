// Last updated: 5/30/2026, 7:08:06 PM
1class Solution 
2{
3    public List<Integer> findDuplicates(int[] nums) 
4    {
5       ArrayList<Integer> res = new ArrayList<>();
6       int[] freq = new int[nums.length+1];
7       for(int num : nums)
8       {
9        freq[num]++;
10       }
11       for(int i =1;i<freq.length;i++)
12       {
13            if(freq[i] == 2)
14            {
15                res.add(i);
16            }
17       }
18       return res;
19    }
20}