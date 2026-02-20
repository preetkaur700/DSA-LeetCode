class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>>result=new ArrayList<>();
        char board[][]=new char[n][n];
        for(char[] row:board){
            Arrays.fill(row,'.');
        }
        nqueens(board,0,n,result);
        return result;
    }
    public void nqueens(char board[][],int row,int n,List<List<String>>ans){
        if(row==n){
            ans.add(convert(board));
            return;
        }
        for(int j=0;j<n;j++){
            if(safe(board,row,j,n)){
                board[row][j]='Q';
                nqueens(board,row+1,n,ans);
                board[row][j]='.';//backtrack
            }
        }
    }
    public boolean safe(char board[][],int row,int col,int n){
        //row
        for(int j=0;j<n;j++){
            if(board[row][j]=='Q'){
                return false;
            }
        }
        //col
        for(int i=0;i<n;i++){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        //left digonal
        for(int i=row,j=col;i>=0&&j>=0;i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        //right diagonal
        for(int i=row,j=col;i>=0&&j<n;i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }
    List<String> convert(char[][] board){
        List<String> result = new ArrayList<>();
        for(char[] row:board){
            result.add(new String(row));
        }
        return result;
    }
}