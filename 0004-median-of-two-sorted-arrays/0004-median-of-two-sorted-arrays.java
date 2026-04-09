class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        int merge[] = new int[n1+n2];
        int k=0;
        for(int i=0;i<n1;i++){
            merge[k++]=nums1[i];
        }
        for(int j=0;j<n2;j++){
            merge[k++]=nums2[j];
        }

        Arrays.sort(merge);
        int n=merge.length;

        for(int i=0;i<n;i++){
            if(n%2==0){
                double mid1 = merge[n/2];
                double mid2 = merge[(n/2)-1];
                return (mid1+mid2)/2.0;
            }else{
                return merge[n/2];
            }
        }
        return 0;
    }
}