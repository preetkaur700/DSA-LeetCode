class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);
        // int count=0;
        // boolean[] trainerUsed= new boolean[trainers.length];
        // for(int i=0;i<players.length;i++){
        //     for(int j=0;j<trainers.length;j++){
        //         if(players[i]<=trainers[j] && (!trainerUsed[j])){
        //             count++;
        //             trainerUsed[j]=true;
        //             break;
        //         }
                
        //     }
        // }
        // return count;

        int p=0;
        int t=0;
        int count=0;
        while(p<players.length && t<trainers.length){
            if(players[p]<=trainers[t]){
                count++;
                p++;
                t++;
            }
            else{
                t++;
            }
        }
        return count;
    }
}

