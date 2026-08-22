class Solution {
    public int findCircleNum(int[][] isConnected) {
        int count=0;
        boolean[] visited = new boolean[isConnected.length];
        for(int i=0;i<isConnected.length;i++){
            if(!visited[i]){
                    count++;
                    find(isConnected,visited,i);
            }
            
        }
        return count;
        
    }
    public void  find(int[][] isConnected,boolean[] visited,int city){    


        visited[city]=true;

        for(int j=0;j<isConnected.length;j++){
            if(isConnected[city][j]==1 && !visited[j]){
                find(isConnected,visited,j);
            }
        }
        
    }
}