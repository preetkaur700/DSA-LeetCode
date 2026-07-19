class Solution {
    public int sumOfUnique(int[] nums) {
        // int freq[] = new int[101];

        // for(int i=0;i<nums.length;i++){
        //     freq[nums[i]]++;
        // }
        int add=0;
        // for(int j=0;j<nums.length;j++){
        //     if(freq[nums[j]]==1){
        //         add+=nums[j];
        //     }
        // }

        // return add;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        for(int i=0;i<nums.length;i++){
            if(map.get(nums[i])==1){
                add+=nums[i];
            }
        }
        
        return add;
    }
}