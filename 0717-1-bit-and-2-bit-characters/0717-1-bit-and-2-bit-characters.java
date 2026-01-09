class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        int i=0;
        int size=bits.length;
        while(i<size-1){
            if(bits[i]==1){
                i+=2;
            }else{
                i+=1;
            }
        }
        return i==size-1;
    }
}