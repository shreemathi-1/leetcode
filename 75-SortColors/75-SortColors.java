// Last updated: 3/8/2026, 9:48:27 PM
1class Solution 
2{
3    public void sortColors(int[] nums) 
4    {
5        int low =0,mid =0,high = nums.length-1;
6        while(mid<=high)
7        {
8            if(nums[mid] == 0)
9            {
10                int temp1 = nums[mid];
11                nums[mid] = nums[low];
12                nums[low] = temp1;
13                mid++;
14                low++;
15            }
16            else if(nums[mid] ==1)
17            {
18                mid++;
19            }
20            else if(nums[mid] == 2)
21            {
22                int temp2 = nums[mid];
23                nums[mid] = nums[high];
24                nums[high] = temp2;
25               
26                high--;
27            }
28        }
29    }
30}