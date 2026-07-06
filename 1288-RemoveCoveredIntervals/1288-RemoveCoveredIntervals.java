// Last updated: 7/6/2026, 9:22:49 PM
1class Solution {
2    public int removeCoveredIntervals(int[][] intervals) {
3        Arrays.sort(intervals,(a,b)->a[0]!=b[0]?a[0]-b[0]:b[1]-a[1]);
4        int res=0,r=0;
5        for(int[]row:intervals){
6            if(row[1]>r){
7                r=row[1];
8                res++;
9            }
10        }
11        return res;
12    }
13}