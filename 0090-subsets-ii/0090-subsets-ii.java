class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Set<List<Integer>> set=new HashSet<>();
        generate(0,nums,new ArrayList<>(),set);
        return new ArrayList<>(set);
    }
    private void generate(int idx,int nums[],List<Integer> curr,Set<List<Integer>> set){
        if(idx==nums.length){
            List<Integer> temp=new ArrayList<>(curr);
            Collections.sort(temp);
            set.add(temp);
            return;
        }
        curr.add(nums[idx]);
        generate(idx+1,nums,curr,set);

        curr.remove(curr.size()-1);
        generate(idx+1,nums,curr,set);
    }
}