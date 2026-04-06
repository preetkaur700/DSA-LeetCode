class Solution {
    public int maxArea(int[] height) 
    {
        //// TLE///
        int n = height.length;
        // int ans=0;    
        // for(int i=0;i<n;i++){

        //     for(int j=i+1;j<n;j++){
        //         int width=j-i;
        //         int minheight=Math.min(height[i],height[j]);
        //         int area=width* minheight;

        //         ans=Math.max(ans,area);
                               
        //     }
        // }
        // return ans;
        ////////two pointer///
        int l=0;
        int r=n-1;
        int ans=0;
        while(l<r){
            int width = r-l;
            int minheight = Math.min(height[l],height[r]);
            int area=width*minheight;
            ans=Math.max(ans,area);

            if(height[l]<height[r]){
                l++;
            }else{
                r--;
            }

        }
        return ans;
    }
}