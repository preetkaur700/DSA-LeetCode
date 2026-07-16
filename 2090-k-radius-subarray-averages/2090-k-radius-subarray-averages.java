class Solution {
    public int[] getAverages(int[] nums, int k) {
        int[] arr = new int[nums.length];
        Arrays.fill(arr,-1);
        int window = 2*k+1;
        long sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];

            if(i>=window-1){
                arr[i-k]=(int)(sum/window);
                sum-=nums[i-window+1];
            }
        }
        return arr;



    }
}