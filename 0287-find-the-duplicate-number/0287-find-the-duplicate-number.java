class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i]))return nums[i];
            set.add(nums[i]);
        }
        return 0;

        // int n=nums.length;
        // int i=0;
        // while(i<n){
        //     int corectIndex=nums[i]-1;

        //     if(nums[i]!=nums[corectIndex]){
        //         swap(nums,i,corectIndex);
        //     }else{
        //         if(i!=corectIndex)return nums[i];
        //         i++;
        //     }
        // }
        // return 0;

        // int ans=0;
    //     for(int j=0;j<n;j++){
    //         if(nums[j]==j+1){
    //             return nums[j];
    //         }
    //     }
    //     return 0;
    // }
    // public void swap(int[] arr,int left,int right){
    //     int temp=arr[left];
    //     arr[left]=arr[right];
    //     arr[right]=temp;
    }
}