class Solution {
    public String removeStars(String s) {
        Stack<Character> s1 = new Stack<>();

        
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);

            if(ch == '*'){
                s1.pop();
            }
            else{
                s1.push(ch);
            }
        }
        StringBuilder result = new StringBuilder();

        while (!s1.isEmpty()) {
            result.append(s1.pop());
        }

        return result.reverse().toString();
        
    }
}