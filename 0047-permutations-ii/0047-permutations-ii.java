class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        unique(nums,0,result);
        return result;
    }
    public void unique(int[] nums,int index,List<List<Integer>> result){
        if(index==nums.length){
            List<Integer>temp=new ArrayList<>();
            for(int arr:nums){
                temp.add(arr);
            }
            result.add(temp);
            return;
        }

        for(int i=index;i<nums.length;i++){
            boolean swap=false;
            for(int j=index;j<i;j++){
                if(nums[i]==nums[j]){
                    swap=true;
                    break;
                }
            }
            if(swap)continue;
            
            swap(nums,i,index);
            unique(nums,index+1,result);
            swap(nums,i,index);
        }
    }
    public void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}