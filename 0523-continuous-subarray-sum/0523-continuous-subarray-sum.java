class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);

        int n = nums.length;
        int len=0,sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            
            int mod = sum%k;
            if(map.containsKey(mod)){
                len = Math.max(len,i-map.get(mod));
            }
            if(!map.containsKey(mod)){
                map.put(mod,i);
            }
            if(len>=2)return true;
        }
        return false;
    }
}