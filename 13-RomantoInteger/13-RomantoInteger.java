// Last updated: 2/22/2026, 8:58:50 PM
1class Solution 
2{
3    public int romanToInt(String s)
4     {
5       int[] val = new int[128];
6        val['I'] = 1;
7        val['V'] = 5;
8        val['X'] = 10;
9        val['L'] = 50;
10        val['C'] = 100;
11        val['D'] = 500;
12        val['M'] = 1000;
13        char[] arr = s.toCharArray();
14        int res =0;
15        int i,j;
16        for( i =0,j=1;i<arr.length-1;i++,j++)
17        {  
18
19            if( val[s.charAt(i)] >= val[s.charAt(j)])
20            {
21                res += val[s.charAt(i)];
22            }
23            else
24            {
25                res -= val[s.charAt(i)];
26            }
27        }
28        res += val[s.charAt(i)];
29        return res;
30    }
31}