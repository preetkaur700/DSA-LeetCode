class Solution {
    public List<List<Integer>> findPrimePairs(int n) {
        boolean[] prime=isPrime(n);
        List<List<Integer>>  list = new ArrayList<>();

        for(int i=2;i<=n/2;i++){  
            int j = n-i;
            if(prime[i] && prime[j]){
              list.add(Arrays.asList(i,j));
            }
        }
        return list;
    }
    public boolean[] isPrime(int n){
        boolean[] prime = new boolean[n+1];
        Arrays.fill(prime,true);
        prime[0]=false;
        prime[1]=false;

        for(int i=2;i*i <= n;i++){
            if(prime[i]){
                for(int j=i*i;j <= n;j+=i){
                    prime[j]=false;
                }
            }
        }
        return prime;
    }
}