// Last updated: 5/30/2026, 2:37:12 PM
1class Solution {
2    public int numIslands(char[][] grid) {
3        int count =0;
4        int r= grid.length;
5        int c = grid[0].length;
6        for(int i =0;i<r;i++)
7        {
8            for(int j =0;j<c;j++)
9            {
10                if(grid[i][j]=='1')
11                {
12                     count++;
13                    dfs(grid,i,j);     
14                }
15            }
16        }
17        return count;
18    }
19    public void dfs(char[][] grid,int i,int j)
20    {
21        if(i<0 || j<0 || i>=grid.length || j >= grid[0].length || grid[i][j] == '0')
22        {
23            return;
24        }
25        grid[i][j] ='0';
26        dfs(grid,i+1,j);
27        dfs(grid,i-1,j);
28        dfs(grid,i,j+1);
29        dfs(grid,i,j-1);
30    }
31}