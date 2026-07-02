class Solution {
    public boolean isHappy(int n) {
        // HashSet<Integer> set=new HashSet<>();
        // while(n!=1){
        //     if(set.contains(n)) return false;
        //     set.add(n);
        //     n=square(n);
        // }
        // return true;
        int slow=n;
        int fast=square(n);
        while(fast!=1 && slow!=fast){
            slow=square(slow);
            fast=square(square(fast));
        }
        return fast==1;
    }
    private int square(int n){
        int sum=0;
        while(n!=0){
            int digit=n%10;
            sum+=digit*digit;
            n/=10;
        }
        return sum;
    }
}