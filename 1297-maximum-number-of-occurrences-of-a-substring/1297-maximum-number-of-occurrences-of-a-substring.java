class Solution {
    public int maxFreq(String s, int maxLetters, int minSize, int maxSize) {
        int left=0;
        int ans=0;
        HashMap<Character,Integer> map=new
        HashMap<>();
        HashMap<String,Integer> map2=new HashMap<>();
        
        for(int r=0;r<s.length();r++){

            char ch=s.charAt(r);
            map.put(ch,map.getOrDefault(ch,0)+1);

             if(r-left+1>minSize){
                char cha=s.charAt(left) ;
                map.put(cha,map.get(cha)-1);
                if(map.get(cha)==0){
                    map.remove(cha);
                }
               left++;
            }

            if(r-left+1==minSize && map.size()<=maxLetters)  {
                String com = s.substring(left,r+1);
                int count=map2.getOrDefault(com,0)+1;
                map2.put(com,count);

                ans=Math.max(ans,count);
            }              
            
         }
         return ans;
    }
}