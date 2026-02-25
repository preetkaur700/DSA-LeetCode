class Solution {
    public int minBitFlips(int start, int goal) {

        int count=0;
        while(start>0 || goal>0){

            int bit=start%2;
            int bit2=goal%2;

            if(bit!=bit2)count++;

            start/=2;
            goal/=2;

        }
        return count;
    }
}