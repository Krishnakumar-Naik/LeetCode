class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> qu=new PriorityQueue<>(Collections.reverseOrder());
        for(int stone:stones){
            qu.add(stone);
        }
        while(qu.size()>1){
            int first=qu.poll();
            int sec=qu.poll();
            if(first!=sec){
                qu.add(first-sec);
            }
        }
        return qu.isEmpty()? 0:qu.peek();
    }
}