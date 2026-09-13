class Solution {
    public int[] sortedSquares(int[] nums) {
        
        // for(int i=0;i<nums.length;i++){
        //     nums[i]=nums[i]*nums[i];
        // }
        // Arrays.sort(nums);
        // return nums;

        int n=nums.length;
        int neg[]=new int[n];
        int pos[]=new int[n];

        int ni=0;
        int pi=0;

        for(int i=0;i<n;i++){
            if(nums[ni]<0){
                neg[ni]=nums[i];
                ni++;
            }else{
                pos[pi]=nums[i];
                pi++;
            }
        }

        if(neg.length==0){
            for(int i=0;i<n;i++){
                pos[i]=pos[i]*pos[i];
            }
            return pos;
        }

        if(pos.length==0){
            for(int i=0;i<n;i++){
                neg[i]=neg[i]*neg[i];
            }
            return neg;
        }

        for(int i=0;i<n;i++){
            neg[i]=neg[i]*neg[i];
        }
        int st=0;
        int end=ni-1;
        while(st<end){
            int temp=neg[st];
            neg[st]=neg[end];
            neg[end]=temp;
            st++;end--;
        }
        for(int i=0;i<n;i++){
            pos[i]=pos[i]*pos[i];
        }

        int i=0;int j=0;
        int res[]=new int[n];
        int id=0;
        while(i<ni && j<pi){
            if(neg[i]<=pos[j]){
                res[id]=neg[i];
                id++;i++;
            }
            else{
                res[id]=pos[j];
                id++;j++;
            }
        }
        while(i<ni){
            res[id]=neg[i];
            id++;i++;
        }
        while(j<pi){
            res[id]=pos[j];
            id++;j++;
        }
        return res;
    }
}