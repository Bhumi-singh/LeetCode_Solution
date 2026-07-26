class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        boolean[] vis=new boolean[n+1];
        int provinces=0;
        for(int i=0;i<isConnected.length;i++){
            if(!vis[i]){
                dfs(isConnected,vis,i);
                provinces++;
            }
        }
        return provinces;
    }
    public void dfs(int[][] isConnected,boolean[] vis,int curr){
        vis[curr]=true;
        for(int i=0;i<isConnected.length;i++){
            if(isConnected[curr][i]==1 && !vis[i]){
                dfs(isConnected,vis,i);
            }
        }
    }
}