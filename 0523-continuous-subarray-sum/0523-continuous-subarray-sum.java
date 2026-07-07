class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum=0;
        int len=0;
        map.put(0,-1);
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            int mod=sum%k;

            if(map.containsKey(mod)){
                len=Math.max(len,i-map.get(mod));
            }else  map.put(mod,i);
        }
        if(len>=2)return true;

        else return false;
    

        // for(int i=0;i<nums.length;i++){
        //     int sum=0;
        //     int len=0;
        //     for(int j=i;j<nums.length;j++){
        //         sum+=nums[j];
        //         if(sum%k==0){
        //             len=Math.max(len,j-i+1);
        //             // return true;
        //         }
        //         if(len>=2)return true;
        //     }
        // }   
        // return false;
    }
}