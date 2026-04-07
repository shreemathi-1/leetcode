// Last updated: 4/7/2026, 7:13:16 PM
1class Solution 
2{
3    public void merge(int[] nums1, int m, int[] nums2, int n) 
4    {
5       if(m==0)
6       {
7         for(int i =n-1;i>=0;i--)
8         {
9            nums1[i] = nums2[n-1];
10            n--;
11         }
12         return;
13       }
14       if(n ==0)
15       {
16        return;
17       }
18       int n1 = m-1;
19       int n2 = n-1;
20       int i = m+n-1;
21            while(n1 >=0 && n2 >=0)
22           {
23            if(nums1[n1] > nums2[n2])
24            {
25                nums1[i] = nums1[n1--];
26            }
27            else
28            {
29                nums1[i] = nums2[n2--];
30            }
31            i--;
32        }
33       while(n2 >=0)
34       {
35            nums1[i--] = nums2[n2--];
36       }
37      
38    }
39}