class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // HashMap<Integer,Integer> map=new HashMap<>();
        // for(int num:nums){
        //     map.put(num,map.getOrDefault(num,0)+1);
        // }
        // ArrayList<Map.Entry<Integer,Integer>> list=new ArrayList<>(map.entrySet());
        // Collections.sort(list,(a,b)-> b.getValue()-a.getValue());
        // int result[]=new int[k];
        // for(int i=0;i<k;i++){
        //     result[i]=list.get(i).getKey();
        // }
        // return result;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        PriorityQueue<Map.Entry<Integer,Integer>> pq=new PriorityQueue<>((a,b)-> a.getValue()-b.getValue());
        
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            pq.add(entry);
            if(pq.size()>k) pq.remove();
        }
        int ans[]=new int[k];
        int index = k - 1;

        while (!pq.isEmpty()) {
            ans[index--] = pq.remove().getKey();
        }

        return ans;
    }
}