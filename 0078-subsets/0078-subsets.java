class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        int n=nums.length;
        int sets = 1<<n; //2^n
        List<List<Integer>> result = new ArrayList<>();
        for(int i=0;i<sets;i++){
            List<Integer> ans = new ArrayList<>();
            for(int j=0;j<n;j++){
                if((i&(1<<j))!=0){
                    ans.add(nums[j]);
                }
            }
        result.add(ans);
        }
        return result;
    }
        // List<List<Integer>> result = new ArrayList<>();
        // set(nums,0,result,new ArrayList<>());
        // return result;
    // }

    // public void set(int[] nums,int i,List<List<Integer>>result,List<Integer>ans){

    //     if(i==nums.length){
    //         result.add(new ArrayList<>(ans));
    //         return;
    //     }

    //     // result.add(new ArrayList<>());
    //     ans.add(nums[i]);
    //     set(nums,i+1,result,ans);

    //     ans.remove(ans.size()-1);
    //     set(nums,i+1,result,ans);
        

    // }
}