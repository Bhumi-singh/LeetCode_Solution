class Solution {
    public int calculate(String s) {
        int num=0;
        int res=0;
        int last=0;
        char op='+';

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isDigit(ch)){
                num=num*10+(ch-'0');
            }
            if((!Character.isDigit(ch) && ch!=' ') || (i==s.length()-1)){
                if(op=='+'){
                    res+=last;
                    last=num;
                }
                else if(op=='-'){
                    res+=last;
                    last=-num;
                }
                else if(op=='*'){
                    last*=num;
                }
                else{
                    last/=num;
                }
                op=ch;num=0;
            }
        }
        return res+last;
    }
}