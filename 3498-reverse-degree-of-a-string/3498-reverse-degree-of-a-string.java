class Solution {
    public int reverseDegree(String s) {
        int product=1;
        int sum=0;
        // for(int i=1;i<s.length();i++){
        //     int ascii=(char)s.charAt(i);
        //     int index = i;
        //     product = ascii*i;
        //     sum+=product;
        // }
        // return sum;
        char[] arr = s.toCharArray();
        for(int i=0;i<arr.length;i++){
            int ascii = 'z' - arr[i]+1;
            int index=i+1;
            product = ascii*index;
            sum+=product;
        }
        return sum;
    }
    
}
