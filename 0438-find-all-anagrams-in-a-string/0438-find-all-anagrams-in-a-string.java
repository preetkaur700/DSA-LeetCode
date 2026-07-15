class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        HashMap<Character,Integer> map = new HashMap<>();
        ArrayList<Integer> li = new ArrayList();
        int l = p.length();

        for(int i=0;i<l;i++){
            char ch = p.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        
        int j=0;int count=map.size();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);

            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)-1);
            
                if(map.get(ch)==0){
                    count--;
                }
            }
            if(i-j+1==l){
                if(count==0){
                    li.add(j);
                }
                char jc = s.charAt(j);
                if(map.containsKey(jc)){
                    map.put(jc, map.getOrDefault(jc,0)+1);

                    if(map.get(jc)==1){
                        count++;
                    }
                }
                j++;
            }
        }
        return li;
    }
}