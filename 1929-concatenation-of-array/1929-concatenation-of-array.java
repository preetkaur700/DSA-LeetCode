class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = 2*nums.length;
        int[] ans = new int[n];
        int k=0;
        for(int i=0;i<nums.length;i++){
            ans[k]=nums[i];
            k++;
        }
        for(int i=0;i<nums.length;i++){
            ans[k]=nums[i];
            k++;
        }
        return ans;
    }
}