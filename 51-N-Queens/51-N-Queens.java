// Last updated: 3/26/2026, 11:39:22 AM
class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();

        char[][] board =  new char[n][n];
        for(int i=0;i < n ; i++){
            Arrays.fill(board[i],'.');

        }
        solve(0,n,board,result);

        return result;
    }
    public void solve ( int row, int n, char[][] board, List<List<String>> result){
        if(row==n){
            List<String> temp = new ArrayList<>();
            for(int i=0;i<n ;i ++){
                temp.add(new  String(board[i]));
            }
            result.add(temp);
            return;
        }

        for(int col=0; col<n ; col++){
            if(isSafe(row,col,n,board,result)){
                board[row][col]='Q';

               solve(row+1,n,board,result); 
               board[row][col]='.';
            }
        }
    }

    public boolean isSafe(int row,int col,int n,char[][] board,List<List<String>> result){

        //column
        for(int i=0; i<row;i++){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        // upper left diagonal
        for(int i=row-1 ,j=col-1 ;i>=0  && j>=0;i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }


        // lower left diagonal
        for(int i=row-1,j=col+1;i>=0 && j<n;i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }
}