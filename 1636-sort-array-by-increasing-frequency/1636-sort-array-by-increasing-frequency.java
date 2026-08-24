class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        Integer arr[]=map.keySet().toArray(new Integer[0]);
        Arrays.sort(arr,(a,b)->{
            if(map.get(a)!=map.get(b)) return map.get(a)-map.get(b);
            return b-a;
        });

        int index=0;
        for(int num:arr){
            int freq=map.get(num);
            while(freq-- >0){
                nums[index++]=num;
            }
        }
        return nums;
    }
}