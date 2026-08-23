class Solution {
    public boolean isPalindromic(String s) {
        StringBuilder sb = new StringBuilder();
        for(char c:s.toCharArray()){
            String binary = Integer.toBinaryString(c);

            while(binary.length()<8){
                binary="0"+binary;
            }

            sb.append(binary);
            
        }

        int l=0;
        int r=sb.length()-1;

        while(l<r){
            if(sb.charAt(l)!=sb.charAt(r)){
                return false;
            }else{
                l++;
                r--;
            }
        }
        return true;
    }
}