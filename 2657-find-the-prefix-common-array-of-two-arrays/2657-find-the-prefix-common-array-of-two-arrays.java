class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n=A.length;
        int m=B.length;
        int[] ans=new int[n];
        int freq[]=new int[n+1];
        int count=0;
        for(int i=0;i<n;i++){
            freq[A[i]]++;
            if(freq[A[i]]==2)count++;
            freq[B[i]]++;
            if(freq[B[i]]==2)count++;

            ans[i]=count;
        }
        return ans;

        
        
        // for(int i=0;i<n;i++){
        //     int count=0;
        //     for(int j=0;j<=i;j++){
        //     for(int k=0;k<=i;k++){
        //         if(A[j]==B[k]){
        //             count++;
        //         }
        //     }
        //     C[i]=count;
        // }
        
        // }
        // return C;
    }
}