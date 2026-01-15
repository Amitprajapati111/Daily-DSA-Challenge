class Solution {
    public int sumSubarrayMins(int[] arr) {
        int n = arr.length;
        int MOD = 1000000007;

        int[] prev = new int[n]; // left distance
        int[] next = new int[n]; // right distance

        Stack<Integer> stack = new Stack<>();

        // 🔹 Previous Smaller (LEFT side)  —— strictly smaller (>)
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] > arr[i]) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                prev[i] = i + 1;
            } else {
                prev[i] = i - stack.peek();
            }

            stack.push(i);
        }

        stack.clear();

        // 🔹 Next Smaller or Equal (RIGHT side) —— (>=)
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                next[i] = n - i;
            } else {
                next[i] = stack.peek() - i;
            }

            stack.push(i);
        }

        long result = 0;

        // 🔹 Contribution
        for (int i = 0; i < n; i++) {
            long contribution = (long) arr[i] * prev[i] * next[i];
            result = (result + contribution) % MOD;
        }

        return (int) result;
    }
}
