class Solution {
    public boolean isBipartite(int[][] graph) {
        int n=graph.length;
        int[] color=new int[n];
        for(int i=0;i<n;i++){
            color[i]=-1;
        }

        for(int i=0;i<graph.length;i++){
            if(color[i]==-1){
                if(!dfs(graph,color,i,0)) return false;
            }
        }
        return true;
    }
    public boolean dfs(int graph[][],int color[],int curr,int currColor){
        color[curr]=currColor;
        for(int i=0;i<graph[curr].length;i++){
            int neigh=graph[curr][i];
            if(color[neigh]==-1){
                if(!dfs(graph,color,neigh,1-currColor)) return false;
            }
            else if(color[neigh]==currColor) return false;
        }
        return true;
    }
}