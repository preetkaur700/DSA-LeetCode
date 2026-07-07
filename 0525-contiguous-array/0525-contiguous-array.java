class Solution {
    public int findMaxLength(int[] nums) {

        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        int sum=0;
        int len=0;
        for(int i=0;i<nums.length;i++){
            sum+=(nums[i]==1)?1:-1;
            if(map.containsKey(sum)){
                len=Math.max(len,i-map.get(sum));
            }else map.put(sum,i);
        }
        return len;

        // int len=0;
        // for(int i=0;i<nums.length;i++)        {
        //     int zero=0,ones=0;
        //     for(int j=i;j<nums.length;j++){
        //         if(nums[j]==0)zero++;
        //         else ones++;

        //         if(zero==ones){
        //             len=Math.max(len,j-i+1);
        //         }
        //     }
        // }
        // return len;
    }
}