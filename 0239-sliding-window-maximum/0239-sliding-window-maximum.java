class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> dq = new LinkedList<>();
        ArrayList<Integer> list  = new ArrayList<>();

        for(int i=0;i<nums.length;i++){

            if(!dq.isEmpty() && dq.peekFirst()<=i-k){
                dq.pollFirst();
            }

            while(!dq.isEmpty() && nums[dq.peekLast()]<=nums[i]){
                dq.pollLast();
            }

            dq.offerLast(i);
            
            if(i>=k-1){
                list.add(nums[dq.peekFirst()]);
            }

            
        }
        int arr[]=new int[list.size()];
        for(int j=0;j<list.size();j++){
            arr[j]=list.get(j);
        }

    return arr;
    }
}