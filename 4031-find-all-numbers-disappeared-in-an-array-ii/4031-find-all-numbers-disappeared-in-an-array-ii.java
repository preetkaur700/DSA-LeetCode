class Solution {
    public List<List<Integer>> findDisappearedNumbers(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        int start = lower;
        for(int num:nums){
            if(num<start){
                continue;
            }

            if(num>upper){
                break;
            }

            if(num>start){
                list.add(Arrays.asList(start,num-1));
            }

            start = num+1;
        }
            if(start<=upper){
                list.add(Arrays.asList(start,upper));
            }
        
        return list;
    }
}