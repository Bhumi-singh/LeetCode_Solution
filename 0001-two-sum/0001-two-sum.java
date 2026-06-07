class Solution {
    public int[] twoSum(int nums[], int target) {
        // for(int i=0;i<nums.length;i++){
        //     int first=nums[i];
        //     for(int j=i+1;j<nums.length;j++){
        //         int second=nums[j];
        //         int sum=first+second;
        //         if(sum==target){
        //         return new int[]{i,j};
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
    }
}    
