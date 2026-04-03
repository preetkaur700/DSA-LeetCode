class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        perm(nums,result,0);
        return result;
    }
    public void perm(int[] nums,List<List<Integer>>result,int index){
        if(index==nums.length){
            List<Integer>ans=new ArrayList<>();
            for(int i:nums)ans.add(i);

            result.add(ans);
                        
        }
    for(int j=index;j<nums.length;j++){
        swap(nums,j,index);
        perm(nums,result,index+1);
        swap(nums,j,index);
    }
}
    public void swap(int[] arr,int l,int r){
        int temp=arr[l];
        arr[l]=arr[r];
        arr[r]=temp;
    }

}