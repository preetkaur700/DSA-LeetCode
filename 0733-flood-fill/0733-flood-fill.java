class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int originalColor = image[sr][sc];
       
        if(originalColor!=color){
            dfs(image,sr,sc,originalColor,color);
        }
        return image;
        
    }   
public static void dfs(int[][]image,int r,int c,int originalColor,int color){

        if(image[r][c]!=originalColor)return;

        image[r][c]=color;

        if(r>=1){
            dfs(image,r-1,c,originalColor,color);
        }
        if(c>=1){
            dfs(image,r,c-1,originalColor,color);
        }
        if(r+1<image.length){
            dfs(image,r+1,c,originalColor,color);
        }
        if(c+1<image[0].length){
            dfs(image,r,c+1,originalColor,color);
        }        
    }
}