class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

    HashSet<Integer> set1 = new HashSet<>();
    HashSet<Integer> result = new HashSet<>();
    for(int i=0;i<nums1.length;i++){

        set1.add(nums1[i]);
    }

    for(int j=0;j<nums2.length;j++){
        if(set1.contains(nums2[j])){
            result.add(nums2[j]);
        }
    }

    int[] r = new int[result.size()];
    int i=0;
    for(int num:result){
        r[i++]=num;
    }
    return r;
    // ArrayList<Integer> result = new ArrayList<>();
    //     for(int i=0;i<nums1.length;i++){
    //         for(int j=0;j<nums2.length;j++){
            
    //             if(nums1[i]==nums2[j]){
    //                 if(!result.contains(nums1[i])){
    //                     result.add(nums1[i]);
    //                 }
    //             }
    //         }
    //     }
    //     int[] arr = new int[result.size()];
    //     for(int i=0;i<result.size();i++){
    //         arr[i]=result.get(i);
    //     }
    //     return arr;
    }
}