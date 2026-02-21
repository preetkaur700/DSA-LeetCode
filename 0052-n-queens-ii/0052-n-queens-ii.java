class Solution {
    public int totalNQueens(int n) {

        char[][] board=new char[n][n];
        for(char[] row:board){
            Arrays.fill(row,'.');
        }
       return nqueens(board,0,n);

    }
    public int nqueens(char[][] board,int row,int n){
        int count=0;
        if(row==n){
            return 1;
        }

            for(int j=0;j<n;j++){
                if(safe(n,board,row,j)){
                    board[row][j]='Q';
                   count+=nqueens(board,row+1,n);
                    board[row][j]='.';
                }
            }
            return count;
    }
    public boolean safe(int n,char[][] board,int row,int col){
        
        for(int j=0;j<n;j++){
            if(board[row][j]=='Q')return false;
        }
        for(int i=0;i<n;i++){
            if(board[i][col]=='Q')return false;
        }
        for(int i=row,j=col;i>=0 && j>=0;i--,j--){
           if(board[i][j]=='Q')return false;
        }

        for(int i=row,j=col;i>=0 && j<n;i--,j++){
            if(board[i][j]=='Q')return false;
        }
        return true;

    }
    List<String> convert(char[][] board){
        List<String>ans = new ArrayList<>();
        for(char[] row:board){
            ans.add(new String(row));
        }
        return ans;
    }
}