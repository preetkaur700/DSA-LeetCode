class Solution {
    public int mySqrt(int x) {
        int start=1;
        int end=x;
        int ans=0;
        while(start<=end){
            int mid=start+(end-start)/2;
            long n=(long)mid*mid;
            if(n==x){
                return mid;
            }
            else if(n<x){
                ans=mid;
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return ans;
    }
}