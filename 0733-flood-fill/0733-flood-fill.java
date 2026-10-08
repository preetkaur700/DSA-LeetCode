class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        
        int originalColor=image[sr][sc];
        if(originalColor!=color){
            fill(image,sr,sc,color,originalColor);
        }

        return image;
    }
    public static void fill(int[][] image,int r,int c,int col,int originalColor){
        if(image[r][c]!=originalColor)return;
        image[r][c]=col;

        if(r>=1){
            fill(image,r-1,c,col,originalColor);
        }
        if(r+1<image.length){
            fill(image,r+1,c,col,originalColor);
        }
        if(c>=1){
            fill(image,r,c-1,col,originalColor);
        }
        if(c+1<image[0].length){
            fill(image,r,c+1,col,originalColor);
        }
    }
}