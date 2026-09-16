class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k<=1) return 0;
        int start=0;
        int prod=1;
        int res=0;
        for(int i=0;i<nums.length;i++){
            prod*=nums[i];
            while(prod>=k && start<=i){
                prod/=nums[start];
                start++;
            }
            res+=i-start+1;
        }
        return res;
    }
}