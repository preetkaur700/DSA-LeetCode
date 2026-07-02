class Solution {
    public int[] sortedSquares(int[] nums) {
        int left=0;
        int right=nums.length-1;
        int[] arr = new int[nums.length];
        int i=nums.length-1;
        while(left<=right){
            int leftm = nums[left]*nums[left];
            int rightm = nums[right]*nums[right];

            if(leftm>rightm){
                arr[i--]=leftm;
                left++;
            }else{
                arr[i--]=rightm;
                right--;
            }
            // i++;
        }
        // Arrays.sort(arr);
        return arr;
    }
}