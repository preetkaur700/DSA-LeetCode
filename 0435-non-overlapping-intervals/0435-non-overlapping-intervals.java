class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[1],b[1]));
        
        int count=0;
        int prev = intervals[0][1];
        for(int j=1;j<intervals.length;j++){
            int start = intervals[j][0];
            int end = intervals[j][1];

            if(start<prev){
                count++;
            }else{
                prev=end;
            }
        }
        return count;
    }
}