class Solution {
    public List<List<Integer>> permute(int[] nums) {
       List<List<Integer>> result = new ArrayList<>();
       perm(nums,0,result,new ArrayList<>());
       return result;
    }
    public void perm(int[] nums,int index,List<List<Integer>>result,List<Integer>ans){
        if(index==nums.length){
            List<Integer> temp=new ArrayList<>();
            for(int arr:nums){
                temp.add(arr);
            }
            result.add(temp);
            return;
        }
        for(int i=index;i<nums.length;i++){
            swap(nums,i,index);
            perm(nums,index+1,result,ans);
            swap(nums,i,index);
        }
    }
    public void swap(int[] n,int l,int r){
        int temp=n[l];
        n[l]=n[r];
        n[r]=temp;
    }
}