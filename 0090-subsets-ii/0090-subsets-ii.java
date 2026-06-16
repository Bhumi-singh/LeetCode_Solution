class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
    //     Set<List<Integer>> set=new HashSet<>();
    //     generate(0,nums,new ArrayList<>(),set);
    //     return new ArrayList<>(set);
    // }
    // private void generate(int idx,int nums[],List<Integer> curr,Set<List<Integer>> set){
    //     if(idx==nums.length){
    //         List<Integer> temp=new ArrayList<>(curr);
    //         Collections.sort(temp);
    //         set.add(temp);
    //         return;
    //     }
    //     curr.add(nums[idx]);
    //     generate(idx+1,nums,curr,set);

    //     curr.remove(curr.size()-1);
    //     generate(idx+1,nums,curr,set);

            Arrays.sort(nums);
            List<List<Integer>> ans=new ArrayList<>();
            backtrack(0,nums,new ArrayList<>(),ans);
            return ans;
    }
    private void backtrack(int idx,int[] nums,List<Integer> curr,List<List<Integer>> ans){
        ans.add(new ArrayList<>(curr));
        for(int i=idx;i<nums.length;i++){
            if(i>idx && nums[i]==nums[i-1]) continue;
            curr.add(nums[i]);
            backtrack(i+1,nums,curr,ans);
            curr.remove(curr.size()-1);
        }
    }
}