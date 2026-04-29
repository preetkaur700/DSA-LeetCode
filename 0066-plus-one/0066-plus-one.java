class Solution {
    public int[] plusOne(int[] digits) {
        int n=digits.length;
        
        for(int i=n-1;i>=0;i--){
            if(digits[i]<9){
                digits[i]+=1;
                return digits;
            }else{
                digits[i]=0;
            }
        }

        int[] ne = new int[n+1];
        for(int i=0;i<n+1;i++){
            ne[0]=1;
            return ne;
        }
        return digits;
    }
}