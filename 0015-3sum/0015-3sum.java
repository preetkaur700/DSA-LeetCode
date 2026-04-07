class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

            HashSet<List<Integer>> result = new HashSet<>();
            int n = nums.length;
            for(int i=0;i<n;i++){
                HashSet<Integer>set= new HashSet<>();
                for(int j=i+1;j<n;j++){
                    int target = -(nums[i]+nums[j]);
                    
                    if(set.contains(target)){
                        List<Integer>st = Arrays.asList(nums[i],nums[j],target);
                        Collections.sort(st);
                        result.add(st);
                    }
                    set.add(nums[j]);
                }                
            }
            return new ArrayList<>(result);
           

            // HashSet<List<Integer>> set = new HashSet<>();
            // for(int i=0;i<n;i++){
            //     for(int j=i+1;j<n;j++){
            //         for(int k=j+1;k<n;k++){
            //             if(nums[i]+nums[j]+nums[k]==0){
            //                 List<Integer> ans = Arrays.asList(nums[i],nums[j],nums[k]);
            //                 Collections.sort(ans);

            //                 if(!set.contains(ans)){
            //                     set.add(ans);
            //                     result.add(ans);
                                                               
            //                 }
            //             }
            //         }
            //     }
            // }            
            // return result;

    
                      
    }
}