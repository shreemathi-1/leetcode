// Last updated: 7/19/2026, 8:56:14 AM
1class Solution {
2    public double angleClock(int hour, int minutes) {
3        double theta =  Math.abs((30 * hour ) - (5.5*minutes));
4        if(theta > 180)
5        {
6            theta = 360 - theta;
7        }
8        return theta;
9    }
10}