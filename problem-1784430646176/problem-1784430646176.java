// Last updated: 7/19/2026, 8:40:46 AM
1class Solution {
2    public boolean canReach(int[] start, int[] target) {
3        int st = start[0] + start[1];
4        int t = target[0] + target[1];
5        if((st%2 ==0 && t%2 ==0) || (st %2 != 0 && t %2 != 0))
6        {
7            return true;
8        }
9        return false;
10    }
11}