// Last updated: 3/28/2026, 11:15:22 PM
1class Solution 
2{
3    public ArrayList<List<String>> res = new ArrayList<>();
4    public boolean isSafe(char[][] board,int row,int col)
5    {
6        for(int i =0;i<board.length;i++)
7        {
8            if(board[i][col] == 'Q')
9            {
10                return false;
11            }
12            
13            for(int j=0;j<board[row].length;j++)
14            {
15                if(board[i][j] == 'Q')
16                {
17                    if(Math.abs(row - i) == Math.abs(col - j))
18                    {
19                        return false;
20                    }
21                }
22            }    
23        }
24        
25        return true;
26    }
27    public void backtrack(char[][] board,int row)
28    {
29        if(row == board.length)
30        {
31            ArrayList<String> l = new ArrayList<>();
32            for(int i =0;i<board.length;i++)
33            {
34               l.add(new String(board[i])); 
35            }
36            res.add(l);
37            return;
38        }
39        for(int j =0;j<board[row].length;j++)
40        {
41            if(isSafe(board,row,j))
42            {
43                board[row][j] = 'Q';
44                backtrack(board,row+1);
45                board[row][j] = '.';
46            }
47        }
48    }
49    public List<List<String>> solveNQueens(int n) 
50    {
51        char[][] board = new char[n][n];
52        for(int i =0;i<n;i++)
53        {
54            Arrays.fill(board[i],'.');
55        }
56        backtrack(board,0);
57        return res;
58    }
59}