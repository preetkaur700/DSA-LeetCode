class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)return false;
        int copy = reverse(x);
        return x == copy;
        
    }
    public int reverse(int n){
        int ans=0;
        while(n>0){
            int digit=n%10;
            ans=ans*10+digit;
            n/=10;
        }
        return ans;
    }
   
}