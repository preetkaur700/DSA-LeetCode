class Solution {
    public int commonFactors(int a, int b) {
        int count=0;
        int gcd = gcd(a,b);
        for(int i=1;i<=a;i++){
            if(gcd%i==0){
                count++;
            }
        }
        return count;
    }
    public int gcd(int a,int b){
        while(b!=0){
            int rem = a%b;
            a=b;
            b=rem;
        }
        return a;
    }
}