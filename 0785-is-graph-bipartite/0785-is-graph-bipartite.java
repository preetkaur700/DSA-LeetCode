class Solution {
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        int[] color = new int[n];
        for(int i=0;i<n;i++){
            if(color[i]==0){
               if(!Bipartite(i,graph,color)){
                return false;
               }
            }
        }
        return true;
    }
    
    public boolean Bipartite(int node,int[][] graph,int color[]){
        Queue<Integer>q = new LinkedList<>();
        color[node]=1;
        q.add(node);

        while(!q.isEmpty()){
            int curr=q.poll();

            for(int n:graph[curr]){
                if(color[n]==color[curr]){
                    return false;
                }
                if(color[n]==0){
                    color[n]=3-color[curr];
                    q.add(n);
                }
            }
        }
        return true;
    }
}