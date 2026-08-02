class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack=new Stack<>();
        int maxarea=0;
        for(int i=0;i<=heights.length;i++){
            int ch=(i==heights.length)? 0:heights[i];

            while(!stack.isEmpty() && ch<heights[stack.peek()]){
                int h=heights[stack.pop()];
                int w=0;
                if(stack.isEmpty()){
                    w=i;
                }else{
                    w=i-stack.peek()-1;
                }
                maxarea=Math.max(maxarea,h*w);
            }
            if(i<heights.length){
                stack.push(i);
            }
        }
        return maxarea;
    }
}