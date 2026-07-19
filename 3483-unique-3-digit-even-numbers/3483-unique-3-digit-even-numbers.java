class Solution {
    TreeSet<Integer> set=new TreeSet<>();
    public int totalNumbers(int[] digits) {
        boolean used[]=new boolean[digits.length];
        backTrack(digits,used,new ArrayList<>());
        return set.size();
    }
    private void backTrack(int digits[],boolean used[],List<Integer> curr){
        if(curr.size()==3){
            if(curr.get(0)==0) return ;
            if(curr.get(2)%2!=0) return;
            int num=curr.get(0)*100+curr.get(1)*10+curr.get(2);
            set.add(num);
            return;
        }
        for(int i=0;i<digits.length;i++){
            if(used[i]) continue;
            used[i]=true;
            curr.add(digits[i]);
            backTrack(digits,used,curr);
            curr.remove(curr.size()-1);
            used[i]=false;
        }
    }
}