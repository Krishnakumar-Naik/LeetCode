class Solution {
    public int[] exclusiveTime(int n, List<String> logs) {
        Stack<Integer> st=new Stack<>();
        int[] arr=new int[n];
        int prevTime=0;
        for(String any:logs){
            String[] prts=any.split(":");
            int id=Integer.parseInt(prts[0]);
            String state=prts[1];
            int exeTime=Integer.parseInt(prts[2]);
            if(state.equals("start")){
                if(!st.isEmpty()){
                    arr[st.peek()]+= exeTime-prevTime;
                }
                st.push(id);
                prevTime=exeTime;
            }else{
                arr[st.pop()]+=exeTime-prevTime+1;
                prevTime=exeTime+1;
            }
        }
        return arr;
    }
}