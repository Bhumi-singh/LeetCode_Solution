class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m=grid.length;
        int n=grid[0].length;
        int total=m*n;
        k=k%total;
        List<List<Integer>> res=new ArrayList<>();
        for(int i=0;i<m;i++){
            res.add(new ArrayList<>());
            for(int j=0;j<n;j++){
                res.get(i).add(0);
            }
        }

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int index=i*n+j;
                int newIndex=(index+k)%total;
                int row=newIndex/n;
                int col=newIndex%n;
                res.get(row).set(col,grid[i][j]);
            }
        }
        return res;
    }
}