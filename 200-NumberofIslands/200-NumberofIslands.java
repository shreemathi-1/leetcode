// Last updated: 5/30/2026, 3:01:16 PM
1class Solution {
2    public int findCenter(int[][] edges) {
3        return ((edges[0][0]==edges[1][0]) || (edges[0][0]==edges[1][1]))? edges[0][0] : edges[0][1]; 
4    }
5}