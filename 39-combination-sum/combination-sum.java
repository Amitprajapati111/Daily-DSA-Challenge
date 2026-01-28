
class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(candidates, target, 0, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int[] candidates, int target, int index,
                           List<Integer> current, List<List<Integer>> result) {

        // base case: exact sum mila
        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        // base case: sum cross ho gaya
        if (target < 0) return;

        // try all options from current index
        for (int i = index; i < candidates.length; i++) {
            current.add(candidates[i]);                 // choose
            backtrack(candidates, target - candidates[i], i, current, result);
            current.remove(current.size() - 1);         // undo (backtrack)
        }
    }
}

