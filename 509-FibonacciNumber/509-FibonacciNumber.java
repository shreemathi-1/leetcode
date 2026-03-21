// Last updated: 3/21/2026, 1:21:34 PM
1class Solution 
2{
3   
4    public int fib(int n) 
5    {
6        if(n==0) return 0;
7        if(n==1) return 1;
8        int f1 = 0;
9        int f2 =1;
10        int f3 = 0;
11        for(int i =2;i<=n;i++)
12        {
13            f3 = f1 + f2;
14            f1 = f2;
15            f2 = f3;
16        }
17        return f2;
18    }
19}