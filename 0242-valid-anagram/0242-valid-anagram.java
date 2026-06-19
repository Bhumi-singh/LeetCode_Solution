class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);

        }

        for(int i=0;i<t.length();i++){
            if(map.get(t.charAt(i))!=null){
                if(map.get(t.charAt(i))==1) map.remove(t.charAt(i));
                else map.put(t.charAt(i),map.get(t.charAt(i))-1);
            }else{
                return false;
            }
        }
        return map.isEmpty();
        // int arr[]=new int[26];
        // int n1=s.length();
        // int n2=t.length();
        // if(n1!=n2) return false;
        // for(int i=0;i<n1;i++){
        //     arr[s.charAt(i)-'a']++;
        //     arr[t.charAt(i)-'a']--;
        // }
        // for(int i=0;i<26;i++){
        //     if(arr[i]!=0) return false;
        // }
        // return true;
    }
}