class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(arr[0],1);
        for(int i=1;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }else{
                map.put(arr[i],1);
            }
        }
        HashSet<Integer> set=new HashSet<>();
        for(int freq:map.values()){
            if(set.contains(freq)){
                return false;
            }
            set.add(freq);
        }
        return true;
    }
}