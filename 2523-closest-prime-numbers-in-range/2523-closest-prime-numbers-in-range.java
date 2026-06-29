class Solution {
    public boolean[] sieve(int n){

        boolean[] prime = new boolean[n+1];
        Arrays.fill(prime,true);
        prime[0]=false;
        prime[1]=false;

        for(int i=2;i*i<=n;i++){
            if(prime[i]){
                for(int j=i*i;j<=n;j+=i){
                    prime[j]=false;
                }
            }
        }
        return prime;

    }
    public int[] closestPrimes(int left, int right) {
        boolean[] prime = sieve(right);
        int prev=-1;
        int[] ans = {-1 , -1};
        int min = Integer.MAX_VALUE;
        for(int i=left;i<=right;i++){
            if(prime[i]){
                if(prev!=-1){
                    int diff = i-prev;
                    if(diff<min){
                        min=diff;
                        ans[0]=prev;
                        ans[1]=i;
                }
            }    
              prev=i;      
            }
        }
        return ans;
    }
}