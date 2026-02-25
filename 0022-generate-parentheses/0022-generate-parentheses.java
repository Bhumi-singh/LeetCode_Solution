class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result=new ArrayList<>();
        backTrack("",0,0,n,result);
        return result;
    }
    public void backTrack(String currentString,int openCount,int closeCount,int n,List<String> result){
        if(currentString.length()==2*n){
            result.add(currentString);
            return;
        }
        if(openCount<n){
            backTrack(currentString+"(",openCount+1,closeCount,n,result);
        }
        if(closeCount<openCount){
             backTrack(currentString+")",openCount,closeCount+1,n,result);
        }
    }
}