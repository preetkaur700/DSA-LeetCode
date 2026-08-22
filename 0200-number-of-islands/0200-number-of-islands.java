class Solution {
    public int numIslands(char[][] grid) {

        int count=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1'){
                    count++;
                    island(grid,i,j);
                }
            }
        }
        return count;
        
    }
    public void island(char[][] grid, int r,int c){
        // if(r>=grid.length || r<0 || c>=grid[0].length || c<0)return;
        if(grid[r][c]=='0')return;
        grid[r][c]='0';

        if(r>0){
            island(grid,r-1,c);
        }
        if(r<grid.length-1){
            island(grid,r+1,c);
        }
        if(c>0){
             island(grid,r,c-1);
        }
        if(c<grid[0].length-1){
             island(grid,r,c+1);
        }
       

    }
}