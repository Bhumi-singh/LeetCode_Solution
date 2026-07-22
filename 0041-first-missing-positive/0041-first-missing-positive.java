class Solution {
    public int firstMissingPositive(int[] nums) {
        // HashSet<Integer> set=new HashSet<>();
        // for(int num:nums){
        //     if(num>0) set.add(num);
        // }
        // int ans=1;
        // while(set.contains(ans)){
        //     ans++;
        // }
        // return ans;

        int n=nums.length;
        int i=0;
        while(i<n){
            int correct=nums[i]-1;
            if(nums[i]>0 && nums[i]<=n && nums[i]!=nums[correct]){
                int temp=nums[i];
                nums[i]=nums[correct];
                nums[correct]=temp;
            }else{
                i++;
            }
        }
        for(int j=0;j<n;j++){
            if(nums[j]!=j+1) return j+1;
        }
        return n+1;
    }
}