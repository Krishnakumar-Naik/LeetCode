class Solution {
    public int findLHS(int[] nums) {
         Map<Integer,Integer> hm=new HashMap<>();
         for(int i:nums){
            hm.put(i,hm.getOrDefault(i,0)+1);
         }
         int sum=0;
         for(Map.Entry<Integer,Integer> e:hm.entrySet()){
            if(hm.containsKey(e.getKey()+1)){
                sum=Math.max(sum,e.getValue()+hm.get(e.getKey()+1));
            }
         }
         return sum;
    }
}