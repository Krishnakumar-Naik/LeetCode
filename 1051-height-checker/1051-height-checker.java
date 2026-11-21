class Solution {
    public int heightChecker(int[] heights) {
        int[] exp=new int[heights.length];
        int c=0;
        for(int i=0;i<heights.length;i++){
            exp[i]=heights[i];
        }
        Arrays.sort(exp);
        for(int i=0;i<heights.length;i++){
            if(exp[i]!=heights[i]){
                c++;
            }
        }
        return c;
    }
}