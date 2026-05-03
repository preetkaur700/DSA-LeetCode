class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {

        int result[] = new int[nums.length];        
        // for(int i=0;i<nums.length;i++){
        //     int count=0;
        //     for(int j=0;j<nums.length;j++){
        //         if(nums[j]<nums[i]){
        //             count++;
        //         }

        //         result[i]=count;
        //     }
        // }
        // return result;
     
     
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] sorted = nums.clone();
        Arrays.sort(sorted);
        for(int i=0;i<sorted.length;i++){
            if(!map.containsKey(sorted[i])){
                map.put(sorted[i],i);
            }
        }

        for(int i=0;i<nums.length;i++){
            result[i]=map.get(nums[i]);
        }
        return result;


    }
}