class Solution {
    public int trap(int[] height) {
        Stack<Integer> st = new Stack<>();
        int area=0;

        for(int i=0;i<height.length;i++){
            
                while(!st.isEmpty() && height[i]>height[st.peek()]){
                    int top = st.pop();
                    if(st.isEmpty())break;
                    int length =  Math.min(height[i],height[st.peek()])-height[top];    
                    int width =   i-st.peek()-1;  

                    area += length*width;   
                }
                st.push(i);            
        }
    return area;
    }
}