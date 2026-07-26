class Solution {
    int parent[];
    public int[] findRedundantConnection(int[][] edges) {
        int n=edges.length;
        parent=new int[n+1];
        for(int i=0;i<n;i++){
            parent[i]=i;
        }
        for(int i=0;i<edges.length;i++){
            int u=edges[i][0];
            int v=edges[i][1];
            if(find(u)==find(v)){
                return edges[i];
            }
            union(u,v);
        }
        return new int[0];
    }
    private int find(int x){
        if(parent[x]!=x){
            parent[x]=find(parent[x]);
        }
        return parent[x];
    }
    public void union(int x,int y){
        if(find(x)!=find(y)){
            parent[find(y)]=find(x);
        }
    }
}