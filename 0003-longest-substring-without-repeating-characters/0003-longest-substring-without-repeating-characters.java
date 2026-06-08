class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int maxLen=0;
        int n=s.length();
        for(int i=0;i<n;i++){
            HashSet<Character> set=new HashSet<>();
            for(int j=i;j<n;j++){
                char ch=s.charAt(j);
                if(set.contains(ch)) break;
                set.add(ch);
                maxLen=Math.max(maxLen,j-i+1);
            }
        }
        return maxLen;
    }
}