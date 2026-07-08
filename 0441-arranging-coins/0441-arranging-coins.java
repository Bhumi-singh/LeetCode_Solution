class Solution {
    public int arrangeCoins(int n) {
        int l=1,r=n;
        while(l<=r){
            int mid=l+(r-l)/2;
            long coinsN=(long) mid*(mid+1)/2;
            if(coinsN==n) return (int)mid;
            else if(coinsN<n) l=mid+1;
            else r=mid-1;
        }
        return (int)r;
    }
}