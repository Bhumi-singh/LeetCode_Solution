class Solution {
    public int maxSubArray(int[] nums) {
        int max=Integer.MIN_VALUE;
        int start=0;
        int sum=0;
        int starti=-1;
        int endi=-1;
        for(int i=0;i<nums.length;i++){
            if(sum==0) start=i;
            sum+=nums[i];
            if(sum>max){
                max=sum;
                starti=start;
                endi=i;
            }
            if(sum<0) sum=0;
        }

        return max;
    }
}