class Solution {
    public int trap(int[] height) {
        Stack<Integer> stack = new Stack<>();  //Stack Inilization
        int water = 0;
        //Traverse left to right
        for(int i=0; i<height.length; i++){

            // jab current bar stack ke top se badi ho
            while(!stack.isEmpty() && height[i]>height[stack.peek()]){  
                int bottomIndex = stack.pop();

                 // agar left boundary hi nahi bachi
                if(stack.isEmpty()){
                    break;
                }
                int leftIndex = stack.peek();
                int rightIndex = i;

                int minHeight = Math.min(height[leftIndex], height[rightIndex]);
                int trappedWater = minHeight-height[bottomIndex];
                int width = rightIndex-leftIndex-1;

                //calculate water
                water += trappedWater*width;
            }
            stack.push(i);
        }
        return water;
        
    }
}