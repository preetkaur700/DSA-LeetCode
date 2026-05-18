class Solution {
    public int countKthRoots(int l, int r, int k) {
        int count=0;
        if(k==1)return r-l+1;
        for(long i=0; ;i++){
           long pow=(long)Math.pow(i,k);
             if (pow>r)break;
            if(pow>=l && pow<=r)count++;
           
            
        }
        return count;
    }
}