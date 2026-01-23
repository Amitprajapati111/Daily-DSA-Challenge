class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        String[] paths = path.split("/");

        for(int i=0; i<paths.length; i++){
            String curr = paths[i];

            if(curr.equals("..")){
                if(stack.size()>0){
                    stack.pop();
                }
            }
            else if(curr.equals(".")|| curr.equals("")){

            }
            else{
                stack.push(curr);
            }

        }
        StringBuilder sb = new StringBuilder();
        while(stack.size()>0){
            sb.insert(0,"/"+stack.pop());
        }
        if(sb.length()==0){
            return ("/");
        }
        return sb.toString();

    }
}