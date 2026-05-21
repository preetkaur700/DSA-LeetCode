class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        HashSet<String> set=new HashSet<>();

        for(int num:arr1){
            String s=Integer.toString(num);
            String prefix="";
            for(int i=0;i<s.length();i++){
                prefix+=s.charAt(i);
                set.add(prefix);
            }
        }
        int ans=0;
        for(int num:arr2){
            String s2=Integer.toString(num);
            String pre="";
            int count=0;
            for(int j=0;j<s2.length();j++){
                pre+=s2.charAt(j);
                if(set.contains(pre)){
                    count++;  
                }else break;
            }
            ans=Math.max(ans,count);
        }
        return ans;
    }
}