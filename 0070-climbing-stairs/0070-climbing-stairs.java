class Solution {
    public int climbStairs(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        return dp(n,dp);
        
    }
    public int dp(int n,int[] arr){
        if(n<=2)return n;

        if(arr[n]!=-1){
            return arr[n];
        }
        arr[n]=dp(n-1,arr) + dp(n-2,arr);
        return arr[n];
    }
}