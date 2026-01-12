class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack = new Stack<>();    //Empty Stack 
        HashMap<Integer,Integer> map = new HashMap<>();   //Empty HashMap

        //nums2 ke sabhi elements ka next greater find and store in |<Stack>| and |<HashMap>|
        for(int i=0; i<nums2.length; i++){
            int current = nums2[i];
            while(!stack.isEmpty() && current>stack.peek()){
                int poped = stack.pop();  //pop element
                map.put(poped, current);  //Add key & value in HashMap
            }
            //push in the stack
            stack.push(current);  

            
        }
        //if next greater Element not found add(-1)
        while(!stack.isEmpty()){
            map.put(stack.pop(), -1);
        }
        int[] result = new int[nums1.length];
        for(int i=0; i<nums1.length; i++){
            result[i]=map.get(nums1[i]);
        }
        return result;  
    }
}