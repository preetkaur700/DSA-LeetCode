class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        int left=0;
        int right=n-1;
        int i=nums.length-1;
        while(left<=right){
            int leftS = nums[left]*nums[left];
            int rightS = nums[right]*nums[right];

            if(rightS>leftS){
                arr[i--]=rightS;
                right--;
            }
            else{
                arr[i--]=leftS;
                left++;
            }
        }
        return arr;
    }
}