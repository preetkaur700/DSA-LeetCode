class Solution {
    public boolean isGoodArray(int[] nums) {
        int gcd=nums[0];
        for(int i=0;i<nums.length;i++){
            gcd = gcd(gcd,nums[i]);

            if(gcd==1){
                return true;
            }
        }
        return false;
    }
    public int gcd(int a,int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }

}