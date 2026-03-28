// Last updated: 3/28/2026, 4:05:56 PM
1class Solution 
2{
3    public List<List<String>> res = new ArrayList<>();
4    public boolean isSafe(char[][] board,int row ,int col)
5    {
6        for(int i=0;i<row;i++)
7        {
8            if(board[i][col] == 'Q')
9            {
10                return false;
11            }
12            for(int j=0;j<board[row].length;j++)
13            {
14                if(board[i][j] == 'Q')
15                {
16                    if(Math.abs(row-i) == Math.abs(col - j))
17                    {
18                        return false;
19                    }
20                }
21                
22            }
23        }
24        return true;
25    }
26    public void backtrack(char[][] board,int row)
27    {
28        if(row == board.length)
29        {
30            ArrayList<String> l = new ArrayList<>();
31            for(int i =0;i<board.length;i++)
32            {
33                l.add(new String(board[i]));
34            }
35            res.add(l);
36            return;
37        }
38        for(int j =0;j<board[row].length;j++)
39        {
40            if( isSafe(board,row,j))
41            {
42                board[row][j] = 'Q';
43                backtrack(board,row+1);
44                board[row][j] = '.';
45            }
46        }
47    }
48    public List<List<String>> solveNQueens(int n) 
49    {
50        char[][] board = new char[n][n];
51        for(int i =0;i<n;i++)
52        {
53            Arrays.fill(board[i],'.');
54        }
55        backtrack(board,0);
56        return res;
57    }
58}