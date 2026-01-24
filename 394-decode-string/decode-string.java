class Solution {
    public String decodeString(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch!=']'){
                stack.push(ch);
            }
            else{
                StringBuilder sb = new StringBuilder();
                while(!stack.isEmpty() && stack.peek() != '['){
                    sb.insert(0, stack.pop());
                }
                String toRepeat = sb.toString();
                stack.pop();

                sb = new StringBuilder();
                while(!stack.isEmpty() && stack.peek()>='0' && stack.peek()<='9'){
                    sb.insert(0, stack.pop());
                }
                int count = Integer.parseInt(sb.toString());

                while(count -- > 0){
                    for(int j=0; j<toRepeat.length(); j++){
                        char c = toRepeat.charAt(j);
                        stack.push(c);

                    }
                }
            }
        }
        StringBuilder ans = new StringBuilder();
        while(!stack.isEmpty()){
            ans.append(stack.pop());
        }
        ans.reverse();
        return ans.toString();
        
    }
}