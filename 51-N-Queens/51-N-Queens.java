// Last updated: 3/26/2026, 11:37:29 AM
1class Solution 
2{
3    public ArrayList<List<String>> res = new ArrayList<>();
4     public boolean isSafe(char[][] board, int row,int col)
5    {
6        for(int i =0;i<row;i++)
7        {
8            if(board[i][col] == 'Q')
9            {
10                return false;
11            }
12            for(int j = 0;j<board[row].length;j++)
13            {
14                if(board[i][j] == 'Q')
15                {
16                    if( Math.abs(row - i) == Math.abs(col - j))
17                    {
18                        return false;
19                    }
20                }
21            }
22        }
23        return true;
24    }
25    public void backtrack(char[][] board,int row)
26    {
27        if(row == board.length)
28        {
29            ArrayList<String> list = new ArrayList<>();
30            for(int i=0;i < board.length;i++)
31            {
32                 list.add(new String(board[i]));
33            }
34          res.add(list);
35          return;
36        }
37        
38            for(int j =0;j<board[row].length;j++)
39            {
40                if(isSafe(board,row,j))
41                {
42                    board[row][j] = 'Q';
43                    backtrack(board,row+1);
44                    board[row][j] = '.';
45                }
46            }
47        
48    }
49    public List<List<String>> solveNQueens(int n) 
50    {
51        
52        char[][] board = new char[n][n];
53        for(int i = 0;i<board.length;i++)
54        {
55            Arrays.fill(board[i],'.');
56        }
57        backtrack(board,0);
58        return res;
59    }
60   
61}