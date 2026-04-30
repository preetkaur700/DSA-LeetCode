class Solution {
    public int[] findErrorNums(int[] nums) {
        Arrays.sort(nums);
        int[] result=new int[2];
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                result[0]=nums[i];
                break;
            }
        }
        for(int i=1;i<nums.length;i++){
            if(nums[i]-nums[i-1]>1){
                result[1]=nums[i-1]+1;
                return result;
            }

        }   
        
        if(nums[0]!=1){
            result[1]=1;
        }else{
            result[1]=nums[nums.length-1]+1;
        }
        
        return result;

    }
}