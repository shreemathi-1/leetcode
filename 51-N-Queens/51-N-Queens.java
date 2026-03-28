// Last updated: 3/28/2026, 3:56:56 PM
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
20                    else
21                    {
22                        break;
23                    }
24                }
25            }
26        }
27        return true;
28    }
29    public void backtrack(char[][] board,int row)
30    {
31        if(row == board.length)
32        {
33            ArrayList<String> list = new ArrayList<>();
34            for(int i=0;i < board.length;i++)
35            {
36                 list.add(new String(board[i]));
37            }
38          res.add(list);
39          return;
40        }
41        
42            for(int j =0;j<board[row].length;j++)
43            {
44                if(isSafe(board,row,j))
45                {
46                    board[row][j] = 'Q';
47                    backtrack(board,row+1);
48                    board[row][j] = '.';
49                }
50            }
51        
52    }
53    public List<List<String>> solveNQueens(int n) 
54    {
55        
56        char[][] board = new char[n][n];
57        for(int i = 0;i<board.length;i++)
58        {
59            Arrays.fill(board[i],'.');
60        }
61        backtrack(board,0);
62        return res;
63    }
64   
65}