// Last updated: 4/24/2026, 7:31:25 PM
1class Solution 
2{
3    public String reverseWords(String s) 
4    {
5        StringBuilder rev = new StringBuilder();
6        String[] arr = s.split("\\s+");
7        for(int i =0;i<arr.length;i++)
8        {
9            char[] let = arr[i].toCharArray();
10            int l = 0;
11            int r = arr[i].length()-1;
12            while(l<r)
13            {
14                char temp = let[l];
15                let[l] = let[r];
16                let[r] = temp;
17                l++;
18                r--;
19            }
20            if(i == arr.length-1)
21             rev.append(new String(let));
22             else
23            rev.append(new String(let)).append(" ");
24        }
25        return rev.toString();
26    }
27}