class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int[] arr = new int[n];
        int k=0;
        for(int i=0;i<n;i++){
            arr[k++]=nums[i]*nums[i];
        }
        Arrays.sort(arr);
        return arr;
    }
}