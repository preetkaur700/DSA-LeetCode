class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        leter(digits,0,result,"");
        return result;
    }

    public void leter(String digits,int index,List<String>result,String ans){
        String[] map = {" "," ","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

        if(index==digits.length()){
            result.add(ans);
            return;
        }
        
        String s = map[digits.charAt(index)-'0'];

        for(int i=0;i<s.length();i++){
            leter(digits,index+1,result,ans+s.charAt(i));   
        }        
        
    }
}