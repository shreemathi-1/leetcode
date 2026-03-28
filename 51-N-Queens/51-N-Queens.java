// Last updated: 3/28/2026, 11:15:47 PM
class Solution {
     List<List<String>> l ;
    public List<List<String>> solveNQueens(int n) {
        l = new ArrayList<>() ;
        int[][] dp = new int[n][n] ;
        HashSet<Integer> set = new HashSet<>(); // coloums k liye 

        for( int i = 0 ; i < n ; i++){
            dp[0][i] = 1 ;
            set.add(i);
            helper( 1 , n , set , dp ) ;
            set.remove(i) ;
            dp[0][i] = 0 ;

        }

        return l ;

    }

    private void helper( int row , int n , HashSet<Integer> set , int[][] dp){
       if( row == n ){
        // convert into string nd add
        converter(dp , n ) ;
        return ;
       }

        for( int i = 0 ; i < n ; i++){
            if( dp[row][i] == 0 && !set.contains(i) && daigonal( row , i , dp)){
            dp[row][i] = 1 ;
            set.add(i);
            helper( row +1 , n , set , dp ) ;
            set.remove(i) ;
            dp[row ][i] = 0 ;
            }
        }

        return ;
    }

    private boolean daigonal ( int row , int col , int[][] dp){
        int r = row ;
        int c = col ;

        while( r >= 0 && c >= 0 ){
            if( dp[r][c] == 0 ){
                r--;
                c--;
            }else{
                return false ;
            }
        }

        r = row ;
        c = col ;

        while( r >= 0 && c < dp.length  ){
            if(dp[r][c] == 1 ) return false ;
            r--;
            c++;
        }
        return true ;
    }

    private void converter( int[][] dp , int n ){
        List<String> ll = new ArrayList<>() ;
        for( int i = 0 ; i < n ; i++ ){
            StringBuilder sb =  new StringBuilder() ;
            for( int j = 0 ; j < n ; j++){
                if(dp[i][j] == 0 ){
                    sb.append('.') ;
                }else{
                    sb.append('Q');
                }
            }
            ll.add(sb.toString()) ;
        }

      if (!l.contains(ll)) 
       l.add(ll);
    }
}