class Solution {
    public int pivotInteger(int n) {
        int left=1;
        int right=n;
        int leftsum=0;
        int rightsum=0;
       while(left<right){
            if(leftsum<rightsum){
                leftsum+=left;
                left++;
            }else{
                rightsum+=right;
                right--;
            }
       }
       if(leftsum==rightsum){
            return left;
       }
       return -1;
    }
}