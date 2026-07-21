class Solution {
    public int[][] merge(int[][] intervals) {
        ArrayList<int[]> l = new ArrayList();
       
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
         int ptart = intervals[0][0];
         int prev = intervals[0][1];
        for (int j = 1; j < intervals.length ; j++) {
            int tart = intervals[j][0];
            int end = intervals[j][1];

            if (tart <=prev) {
                prev = Math.max(prev,end);
            }else{
                l.add(new int[]{ptart,prev});
                ptart = tart;
                prev=end;
            }
        }
        l.add(new int[]{ptart,prev});

        return l.toArray(new int[l.size()][]);

    }
}
