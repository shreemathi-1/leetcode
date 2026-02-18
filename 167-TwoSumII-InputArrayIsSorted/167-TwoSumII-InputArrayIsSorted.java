// Last updated: 2/18/2026, 8:35:11 PM
1class Solution
2{
3    public int[] twoSum(int[] numbers, int target)
4    {
5        int l = 0;
6        int r = numbers.length-1;
7        while(l<r)
8        {
9            int sum = numbers[l]+ numbers[r];
10            if(sum == target)
11            {
12                return new int[]{l+1,r+1};
13            }
14            else if(sum > target)
15            {
16                r--;
17            }
18            else {
19                l++;
20            }
21        }
22return new int[]{-1,-1}; 
23    }
24}