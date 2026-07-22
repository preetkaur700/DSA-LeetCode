class Solution {
    public char findTheDifference(String s, String t) {
        HashMap<Character,Integer> map = new HashMap();

        for(int j=0;j<s.length();j++){
            char ch = s.charAt(j);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }


        for(int k=0;k<t.length();k++){
            char ch = t.charAt(k);
           
           if(!map.containsKey(ch) || map.get(ch)==0){
                return ch;
           }
           else
              map.put(ch,map.get(ch)-1);
        }
        return ' ';
    }
}