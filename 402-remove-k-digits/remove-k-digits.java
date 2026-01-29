class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<num.length(); i++){
            char ch = num.charAt(i);
            while(!stack.isEmpty() && k>0 && ch<stack.peek()){
                stack.pop();
                k--;
            }
            stack.push(ch);

        }
        //when now also k!=0
        while(!stack.isEmpty() && k>0){
            stack.pop();
            k--;
        }
        //
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<stack.size(); i++){
            sb.append(stack.get(i));
        }
        //remember leading zero
        while(sb.length()>0 && sb.charAt(0)=='0'){
            sb.deleteCharAt(0);
        }
        return sb.length()==0 ? "0" : sb.toString();
        
    }
}