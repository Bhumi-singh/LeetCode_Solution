class Solution {
    public int maxNumberOfBalloons(String text) {
        int fre[] = new int[26];
        for(char ch:text.toCharArray()){
            fre[ch-'a']++;
        }
        int b = fre['b'-'a'];
        int a = fre['a'-'a'];
        int n = fre['n'-'a'];
        int l = fre['l'-'a']/2;
        int o = fre['o'-'a']/2;
        return Math.min(b,Math.min(a,Math.min(n,Math.min(l,o))));
    }
}