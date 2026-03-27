// Last updated: 3/27/2026, 10:53:16 PM
1class Solution {
2    public boolean isPowerOfTwo(int n) 
3    {
4        if(n<=0) return false;
5        while(n%2==0)
6        {
7            n /= 2 ;
8        }       
9        return n==1;
10    }
11}