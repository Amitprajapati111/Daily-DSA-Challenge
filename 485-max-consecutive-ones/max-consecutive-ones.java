class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int ones = 0;
        int prev_ones = 0;
        int max = 0;
        
        for(int i=0; i<n; i++){
            if(nums[i] == 1){
                ones ++;
                prev_ones = ones;
            }
            else{
                ones = 0;
            }
            max = Math.max(max, prev_ones);
        }
        return max;
        
    }
}