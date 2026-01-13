class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> stack = new Stack<>();    //Empty Stack 
        int n = nums.length;
        int result[] = new int[n];
        Arrays.fill(result, -1);

        for(int i=0; i<2*n; i++){
            int currentIdx = i%n;
            int currentVal = nums[currentIdx];
            while(!stack.isEmpty() && currentVal>nums[stack.peek()]){
                int previousIdx = stack.pop();
                result[previousIdx] = currentVal;

            }
            if(i<n){
                stack.push(currentIdx);
            }

        }
        return result;
    }
}