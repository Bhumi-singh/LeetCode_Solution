class Solution {
    public int removeDuplicates(int[] nums) {
        // ArrayList<Integer> temp=new ArrayList<>();
        // temp.add(nums[0]);
        // for(int i=1;i<nums.length;i++){
        //     if(nums[i]!=nums[i-1]) temp.add(nums[i]);
        // }

        // for(int i=0;i<temp.size();i++){
        //     nums[i]=temp.get(i);
        // }
        // return temp.size();
        int i=0;
        int res=1;
        int j=1;
        while(j<nums.length){
            if(nums[j]==nums[j-1]){
                j++;
                continue;
            }
            nums[i+1]=nums[j];
            i++;
            res++;
            j++;
        }
        return res;
    }
}