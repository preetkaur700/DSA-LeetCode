class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> result = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            ArrayList<Integer> list = new ArrayList<>();

            while(nums[i]!=0){
                int digit=nums[i]%10;
                list.add(digit);
                nums[i]/=10;        
            }

            for(int j=list.size()-1;j>=0;j--){
                result.add(list.get(j));
            }
        }
        int[] ans = new int[result.size()];      
        for(int i=0;i<ans.length;i++){
            ans[i]=result.get(i);
        }
        return ans;
    }
}