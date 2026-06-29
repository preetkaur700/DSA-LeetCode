class Solution {
    public boolean squareIsWhite(String coordinates) {
        char chess = coordinates.charAt(0);
        int first = chess-'a'+1;
        int second = coordinates.charAt(1);

        if((first+second)%2==0){
            return false;
        }
        return true;

    }
}