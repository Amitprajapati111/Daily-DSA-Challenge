class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int answer[] = new int[n];
        Stack<Integer> stack = new Stack<>();
        
        //1st find next gratest temp. 
        for(int i=0; i<n; i++){
            while(!stack.isEmpty() && temperatures[i]>temperatures[stack.peek()]){
                int previousIdx = stack.pop();
                answer[previousIdx] = i-previousIdx;
            }
            stack.push(i);
        }
        return answer;
    }
}