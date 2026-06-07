class Solution {
    // public int longestConsecutive(int[] nums) {
    //     if(nums.length==0) return 0;

    //     int longest=0;
    //     for(int i=0;i<nums.length;i++){
    //         int x=nums[i];
    //         int cnt=1;
    //         while(exists(nums,x+1)==true){
    //             x=x+1;
    //             cnt=cnt+1;
    //         }
    //         longest=Math.max(longest,cnt);
    //     }
    //     return longest;
    // }
     
    //  private boolean exists(int[] nums,int num){
    //     for(int i=0;i<nums.length;i++){
    //         if(nums[i]==num) return true;
    //     }
    //     return false;
    //  }
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;

        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int longest = 0;

        for (int num : set) {
            // only start from the beginning of a sequence
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int count = 1;

                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    count++;
                }

                longest = Math.max(longest, count);
            }
        }

        return longest;
    }
}