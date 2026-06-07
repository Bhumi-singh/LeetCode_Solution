class Solution {
    public int[] twoSum(int nums[], int target) {
        // for(int i=0;i<nums.length;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         if((nums[i]+nums[j])==target){
        //             return new int[]{i,j};
        //         }
        //     }
        // }
        // return new int[]{};

        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int moreneeded=target-nums[i];
            if(map.containsKey(moreneeded)){
                return new int[]{map.get(moreneeded),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{-1,-1};

        // int left=0;
        // int right=nums.length-1;
        // Arrays.sort(nums);
        // while(left<right){
        //     int sum=nums[left]+nums[right];
        //     if(sum==target) return true;
        //     else right--;
        // }
        // return false;
    }
}    
