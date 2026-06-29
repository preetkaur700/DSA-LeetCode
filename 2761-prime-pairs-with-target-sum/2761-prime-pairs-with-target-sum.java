class Solution {
    public boolean[] sieve(int n){
        // if(n<2)return false;

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
    public List<List<Integer>> findPrimePairs(int n) {

        boolean[] prime = sieve(n);
        List<List<Integer>> result = new ArrayList<>();

        for(int i=2;i<=n/2;i++){
            int j=n-i;

            if(prime[i] && prime[j]){
                result.add(Arrays.asList(i,j));
            }
        }

        return result;
    
    }
}