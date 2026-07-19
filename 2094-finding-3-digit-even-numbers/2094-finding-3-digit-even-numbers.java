class Solution {
    TreeSet<Integer> set=new TreeSet<>();
    public int[] findEvenNumbers(int[] digits) {
        boolean used[]=new boolean[digits.length];
        backTrack(digits,used,new ArrayList<>());
        int idx=0;
        int ans[]=new int[set.size()];
        for(int num:set){
            ans[idx++]=num;
        }
        return ans;
        // TreeSet<Integer> set=new TreeSet<>();
        // int n=digits.length;
        // for(int i=0;i<n;i++){
        //     if(digits[i]==0) continue;
        //     for(int j=0;j<n;j++){
        //         if(i==j) continue;

        //         for(int k=0;k<n;k++){
        //             if(k==i || k==j) continue;
        //             if(digits[k] % 2!=0) continue;

        //             int num=digits[i]*100+digits[j]*10+digits[k];
        //             set.add(num);
        //         }
        //     }
        // }
        // int idx=0;
        // int ans[]=new int[set.size()];
        // for(int num:set){
        //     ans[idx++]=num;
        // }
        // return ans;
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