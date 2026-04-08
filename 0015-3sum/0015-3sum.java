class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
/////////optimal using two pointer////
    List<List<Integer>> result = new ArrayList<>();
    int n = nums.length;
    Arrays.sort(nums);
    
    for(int i=0;i<n-2;i++){

        if(i>0 && nums[i]==nums[i-1])continue;
        int j=i+1, k=n-1;

        while(j<k){
            int sum = nums[i]+nums[j]+nums[k];
           
            if(sum<0){
                j++;
            }else if(sum>0){

                k--;          
            }else{
                result.add(Arrays.asList(nums[i],nums[j],nums[k]));
                j++;
                k--;
            

                while(j<k && nums[j]==nums[j-1])j++;


            } 
        }
    }
    return result;
        
/////////////better optimal using hashing method with lop////////////
            // HashSet<List<Integer>> result = new HashSet<>();
            // int n = nums.length;
            // for(int i=0;i<n;i++){
            //     HashSet<Integer>set= new HashSet<>();
            //     for(int j=i+1;j<n;j++){
            //         int target = -(nums[i]+nums[j]);
            //         c
            //         if(set.contains(target)){
            //             List<Integer>st = Arrays.asList(nums[i],nums[j],target);
            //             Collections.sort(st);
            //             result.add(st);
            //         }
            //         set.add(nums[j]);
            //     }                
            // }
            // return new ArrayList<>(result);
           ///////////////brute force////////////

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