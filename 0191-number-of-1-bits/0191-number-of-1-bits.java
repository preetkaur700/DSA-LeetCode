class Solution {
    public int hammingWeight(int n) {
        int count=0;
        // while(n>0){
            
        //     int bit = n%2;

        //     if(bit==1)count++;

        //     n/=2;
        // }
        // return count;

        while(n!=0){
            n = n & (n-1);
            count++;
        }
        return count;
    }
}