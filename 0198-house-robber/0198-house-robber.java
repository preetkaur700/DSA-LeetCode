class Solution {
    public int rob(int[] nums) {
        int  n = nums.length;
        int[] arr = new int[n];

        Arrays.fill(arr,-1);
        int result = r(nums,0,arr);
        return result;
      
    }
    public int r(int[] nums,int i,int[] arr){
        if(i>=nums.length)return 0;
        if(i<0)return 0;

        if(arr[i]!=-1){
            return arr[i];
        }
        int take = nums[i] + r(nums,i+2,arr);
        int skip = r(nums,i+1,arr);
        
        int ans = Math.max(take,skip);
        arr[i] = ans;
        return ans;
    }

    // public int r(int[] nums,int i){
    //     if(nums.length==1)return nums[0];
    //     if(i<0)return 0;
    //     if(i>=nums.length)return 0;

    //     int take = nums[i]+r(nums,i+2);

    //     int skip = r(nums,i+1);

    //     int ans = Math.max(take,skip);
    //     return ans;
    // }
}