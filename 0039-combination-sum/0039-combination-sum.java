class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res=new ArrayList<>();
        BackTracking(0,candidates,target,res,new ArrayList<>());
        return res;
    }
    public static void BackTracking(int i,int[] arr,int target,List<List<Integer>> List,List<Integer> curr){
        if(i==arr.length){
            if(target==0){
                List.add(new ArrayList<>(curr));
            }
            return;
        }
        if(arr[i]<=target){
            curr.add(arr[i]);
            BackTracking(i,arr,target-arr[i],List,curr);
            curr.remove(curr.size()-1);
        }
        BackTracking(i+1,arr,target,List,curr);
    }
}