class Solution {
    public boolean isPalindrome(int x) {
        int ans=0;
        int original=x;
        // if(x<0)
        while(x>0){
            int digit=x%10;
            if(ans>Integer.MAX_VALUE/10 || ans<Integer.MIN_VALUE)return false;
            ans = ans*10+digit;
            x/=10;
        }
        if(original==ans)return true;
        return false;

    }
}