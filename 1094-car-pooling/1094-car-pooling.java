class Solution {
    public boolean carPooling(int[][] trips, int capacity) {

        int[] arr = new int[1001];
        for(int i=0;i<trips.length;i++){
            int pass = trips[i][0];
            int from = trips[i][1];
            int to = trips[i][2];

            arr[from]+=pass;
            arr[to]-=pass;
        }

        int currPass=0;
        for(int i=0;i<1001;i++){
            currPass+=arr[i];
            if(currPass>capacity){
                return false;
            }
        }
        return true;
    }
}