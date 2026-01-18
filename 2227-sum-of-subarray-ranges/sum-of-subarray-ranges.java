class Solution {
    public long subArrayRanges(int[] nums) {
        int n = nums.length;
        long minSum = 0;
        Stack<Integer> stack = new Stack<>();

        // MINIMUM contribution
        for(int i=0; i<=n; i++){ 
            while(!stack.isEmpty() && (i == n || nums[stack.peek()] > nums[i])){
                int mid = stack.pop();
                int left = stack.isEmpty() ? -1 : stack.peek();
                int right = i;
                long count = (long)(mid-left)*(right-mid);
                minSum = minSum+(nums[mid]*count);
            }
            stack.push(i);
            
        }
        stack.clear();
        long maxSum = 0;
        // MINIMUM contribution
        for(int i=0; i<=n; i++){
            while(!stack.isEmpty() && (n==i || nums[stack.peek()] < nums[i])){
                int mid = stack.pop();
                int left = stack.isEmpty() ? -1 : stack.peek();
                int right = i;
                long count = (long)(mid-left)*(right-mid);
                maxSum = maxSum+(nums[mid]*count);
            }
            stack.push(i);
            
        }
        return maxSum-minSum;
    }
    
}