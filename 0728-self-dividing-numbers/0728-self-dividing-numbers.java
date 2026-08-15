class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans=new ArrayList<>();
        for(int i=left;i<=right;i++){
            boolean valid=true;
            int temp=i;
            while(temp>0){
                int digit=temp%10;
                if(digit==0 || i%digit!=0){
                    valid=false;
                    break;
                }
                temp/=10;
            }
            if(valid){
                ans.add(i);
            }
        }
        return ans;
    }
}