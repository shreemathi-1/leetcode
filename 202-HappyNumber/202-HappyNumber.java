// Last updated: 4/1/2026, 12:29:17 PM
1class Solution 
2{
3    public int next(int n)
4    {
5        int rem = 0,sum =0;
6        while(n > 0)
7        {
8            rem= n%10;
9            sum += rem*rem;
10            n /= 10;
11        }
12        return sum;
13    }
14    public boolean isHappy(int n) 
15    {
16        int slow = n;
17        int fast = n;
18        do
19        {
20            slow = next(slow);
21            fast = next(next(fast));
22        }while(slow != fast);
23        return slow ==1;
24        
25    }
26}