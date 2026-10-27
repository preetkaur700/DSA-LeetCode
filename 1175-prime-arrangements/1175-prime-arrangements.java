class Solution {
    public int numPrimeArrangements(int n) {

        long mod = 1000000007;    
        boolean[] prime = isPrime(n);

        int count=0;
        for(int i=2;i<=n;i++){
            if(prime[i]){
                count++;
            }
        }

        int nonPrimeCount = n-count;
        long primeFact = 1;
        for(int i=2;i<=count;i++){
            primeFact = (primeFact*i)%mod;
        }

        long nonPrimeFact = 1;
        for(int i=2;i<=nonPrimeCount;i++){
            nonPrimeFact=(nonPrimeFact*i)%mod;
        }

        return (int)((primeFact*nonPrimeFact)%mod);
    }
    public boolean[] isPrime(int n){
        boolean[] prime = new boolean[n+1];
        
        Arrays.fill(prime,true);
        
        prime[0]=false;
        prime[1]=false;
        for(int i=2;i<=n;i++){
            if(prime[i]){
                for(int j=i*i;j<=n;j+=i){
                    prime[j]=false;
                }
            }
        }
        return prime;
    }
}