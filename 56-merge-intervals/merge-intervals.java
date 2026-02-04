class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length == 0) return new int[0][0];

        //Step -01 Sort according to start time
        Arrays.sort(intervals,(a,b) -> a[0]-b[0]);

        List<int []> result = new ArrayList<>();
        int current[] = intervals[0];

        for(int i=0; i<intervals.length; i++){
            int end[] = intervals[i];

            if(current[1] >= end[0]){
                current[1] = Math.max(current[1], end[1]);
            }
            else{
                result.add(current);
                current = end;
            }
        }
        result.add(current);
        return result.toArray(new int[result.size()][]);
        
    }
}