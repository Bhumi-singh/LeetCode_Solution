class Solution {
    public List<String> generateParenthesis(int n) {
        // List<String> result=new ArrayList<>();
        // backTrack("",0,0,n,result);
        // return result;
        List<String> result=new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        backTrack(sb,0,0,n,result);
        return result;
    }
    // public void backTrack(String currentString,int openCount,int closeCount,int n,List<String> result){
    //     if(currentString.length()==2*n){
    //         result.add(currentString);
    //         return;
    //     }
    //     if(openCount<n){
    //         backTrack(currentString+"(",openCount+1,closeCount,n,result);
    //     }
    //     if(closeCount<openCount){
    //          backTrack(currentString+")",openCount,closeCount+1,n,result);
    //     }
    // }
    public void backTrack(StringBuilder sb,int openCount,int closeCount,int n,List<String> result){
        if(sb.length()==2*n){
            result.add(sb.toString());
            return;
        }
        if(openCount<n){
            sb.append("(");
            backTrack(sb,openCount+1,closeCount,n,result);
            sb.deleteCharAt(sb.length() - 1);
        }
        if(closeCount<openCount){
            sb.append(")");
            backTrack(sb,openCount,closeCount+1,n,result);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}