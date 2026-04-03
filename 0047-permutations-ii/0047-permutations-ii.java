class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        permDuplicate(nums,result,0);
        return result;
    }
    public void permDuplicate(int[] nums,List<List<Integer>>result ,int i){

        if(i==nums.length){
            List<Integer>ans=new ArrayList<>();
            for(int n:nums)ans.add(n);
            result.add(ans);return;
        }
        for(int j=i;j<nums.length;j++){
            boolean swap=false;
            for(int k=i;k<j;k++){
                if(nums[j]==nums[k]){
                    swap=true;
                    break;
            }
        }
            if(swap) continue;           
            swap(nums,j,i);
            permDuplicate(nums,result,i+1);
            swap(nums,j,i);
        }
        
    }
    public void swap(int[] arr,int l,int r){
        int temp=arr[l];
        arr[l]=arr[r];
        arr[r]=temp;
    }
}