class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        // int maxLen=0;
        // int n=s.length();
        // for(int i=0;i<n;i++){
        //     HashSet<Character> set=new HashSet<>();
        //     for(int j=i;j<n;j++){
        //         char ch=s.charAt(j);
        //         if(set.contains(ch)) break;
        //         set.add(ch);
        //         maxLen=Math.max(maxLen,j-i+1);
        //     }
        // }
        // return maxLen;

        HashMap<Character, Integer> map=new HashMap<>();
        int maxLen=0;
        int left=0;
        for(int right=0;right<s.length();right++){
            char ch=s.charAt(right);
            if(map.containsKey(ch)) left=Math.max(left,map.get(ch)+1);
            map.put(ch,right);
            maxLen=Math.max(maxLen,right-left+1);
        }
        return maxLen;
    }
}