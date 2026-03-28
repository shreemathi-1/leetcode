// Last updated: 3/28/2026, 4:07:16 PM
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
20                    else
21                    {
22                        break;
23                    }
24                }
25                
26            }
27        }
28        return true;
29    }
30    public void backtrack(char[][] board,int row)
31    {
32        if(row == board.length)
33        {
34            ArrayList<String> l = new ArrayList<>();
35            for(int i =0;i<board.length;i++)
36            {
37                l.add(new String(board[i]));
38            }
39            res.add(l);
40            return;
41        }
42        for(int j =0;j<board[row].length;j++)
43        {
44            if( isSafe(board,row,j))
45            {
46                board[row][j] = 'Q';
47                backtrack(board,row+1);
48                board[row][j] = '.';
49            }
50        }
51    }
52    public List<List<String>> solveNQueens(int n) 
53    {
54        char[][] board = new char[n][n];
55        for(int i =0;i<n;i++)
56        {
57            Arrays.fill(board[i],'.');
58        }
59        backtrack(board,0);
60        return res;
61    }
62}