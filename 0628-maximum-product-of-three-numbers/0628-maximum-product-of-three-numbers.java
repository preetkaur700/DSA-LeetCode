class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int l = nums.length;
        int a1 = nums[l-1]*nums[l-2]*nums[l-3];
        int a2 = nums[0]*nums[1]*nums[l-1];

        return Math.max(a1,a2);
    }
}