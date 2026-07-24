class Solution {
    public int maxPoints(int[][] points) {
        int n=points.length;
        if(n<=2) return n;
        int ans=0;
        for(int i=0;i<n;i++){
            HashMap<String,Integer> map=new HashMap<>();
            int duplicates=0;
            int maxSlope=0;
            int x1=points[i][0];
            int y1=points[i][1];

            for(int j=i+1;j<n;j++){
                int x2=points[j][0];
                int y2=points[j][1];

                if(x1==x2 && y1==y2){
                    duplicates++;
                    continue;
                }

                int dx=x2-x1;
                int dy=y2-y1;

                if(dx==0) dy=1;
                else if(dy==0) dx=1;
                else{
                    if(dx<0){
                        dx=-dx;
                        dy=-dy;
                    }
                    int g=gcd(Math.abs(dx),Math.abs(dy));
                    dx/=g;
                    dy/=g;
                }

                String slope=dy + "/" +dx;
                int count=map.getOrDefault(slope,0)+1;
                map.put(slope,count);
                maxSlope=Math.max(maxSlope,count);
            }
            ans=Math.max(ans,maxSlope+duplicates+1);
        }
        return ans;
    }
    private int gcd(int a,int b){
        while(b!=0){
            int temp=a%b;
            a=b;
            b=temp;
        }
        return a;
    }
}