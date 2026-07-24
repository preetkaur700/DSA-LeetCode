class Solution {
    public int characterReplacement(String s, int k) {
        int l=0;
        int max = 0;
        int an = 0;
        HashMap<Character,Integer> map = new HashMap();
        for(int j=0;j<s.length();j++){
            char ch = s.charAt(j);
            map.put(ch,map.getOrDefault(ch,0)+1);

            max = Math.max(max,map.get(ch));

            while((j-l+1 ) - max >k){
                char c = s.charAt(l);
                map.put(c,map.get(c)-1);
                l++;
                
            }


            an = Math.max(an,j-l+1);
        }
        return an;
    }
}



        