// Last updated: 3/21/2026, 1:21:15 PM
1class Solution 
2{
3   
4    public int fib(int n) 
5    {
6        if(n==0) return 0;
7        if(n==1) return 1;
8        else
9        {
10            return fib(n-1)+fib(n-2);
11        }
12    }
13}