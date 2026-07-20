// class Solution {
//     public int calculate(String s) {
//         // Stack<Integer> stack=new Stack<>();
//         // int num=0;
//         // int res=0;
//         // int sign=1;
//         // for(int i=0;i<s.length();i++){
//         //     char ch=s.charAt(i);
//         //     if(Character.isDigit(ch)){
//         //         num=num*10+(ch-'0');
//         //     }

//         //     else if(ch=='+'){
//         //         res+=sign*num;
//         //         num=0;
//         //         sign=1;
//         //     }
//         //     else if(ch=='-'){
//         //         res+=sign*num;
//         //         num=0;
//         //         sign=-1;
//         //     }
//         //     else if(ch=='('){
//         //         stack.push(res);
//         //         stack.push(sign);
//         //         res=0;
//         //         sign=1;
//         //     }
//         //     else if(ch==')'){
//         //         res+=sign*num;
//         //         num=0;
//         //         res*=stack.pop();
//         //         res+=stack.pop();
//         //     }
//         // }
//         // res+=sign*num;
//         // return res;
        
//     }
// }

class Solution {
    int idx = 0;

    public int calculate(String s) {
        return solve(s);
    }

    private int solve(String s) {
        int result = 0;
        int number = 0;
        int sign = 1;

        while (idx < s.length()) {
            char ch = s.charAt(idx);

            if (Character.isDigit(ch)) {
                number = number * 10 + (ch - '0');
            }
            else if (ch == '+') {
                result += sign * number;
                number = 0;
                sign = 1;
            }
            else if (ch == '-') {
                result += sign * number;
                number = 0;
                sign = -1;
            }
            else if (ch == '(') {
                idx++;                  // Skip '('
                number = solve(s);      // Evaluate inside parentheses
            }
            else if (ch == ')') {
                result += sign * number;
                return result;          // Return to previous level
            }

            idx++;
        }

        return result + sign * number;
    }
}