class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> list = new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            list.add(new ArrayList<>());
        }

        for(int[] pre: prerequisites){
            int u = pre[0];
            int v = pre[1];
            list.get(v).add(u);
        }

        boolean[] visited = new boolean[numCourses];
        boolean[] path = new boolean[numCourses];

        for(int i=0;i<numCourses;i++){
            if(!visited[i]){
                if(dfs(i,list,visited,path)){
                    return false;
                }
            }
        }
        return true;
    }
    public boolean dfs(int node, List<List<Integer>> list,boolean[] visited,boolean[] path){

            visited[node]=true;
            path[node]=true;

            for(int neighbour:list.get(node)){
                if(!visited[neighbour]){
                    if(dfs(neighbour,list,visited,path)){
                        return true;
                    }
                    
                }else if(path[neighbour]){
                    return true;
                }
            }
            path[node]=false;
            return false;
    }
}