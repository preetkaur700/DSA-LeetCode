class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int count=0;
        int max=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    
                    int area = max(grid,i,j);
                    max=Math.max(max,area);
                }
                
            }
        }
        return max;
    }   

    public int max(int[][]grid,int r,int c){

        if(grid[r][c]==0)return 0;
        grid[r][c]=0;
        int area=1;
        if(r>0){
            area+=max(grid,r-1,c);            
        }
        if(r<grid.length-1){
            area+=max(grid,r+1,c);
        }
        if(c>0){
            area+=max(grid,r,c-1);
        }
        if(c<grid[0].length-1){
            area+=max(grid,r,c+1);
        }
        return area;

    }
}