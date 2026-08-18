class Solution {
    public int largestInteger(int[] nums, int k) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        int maxval=-1;
        for(int i=0;i<=nums.length-k;i++){
            HashSet<Integer> set=new HashSet<>();

            for(int j=i;j<k+i;j++){
                set.add(nums[j]);
            }

            for(int num:set){
                mp.put(num,mp.getOrDefault(num,0)+1);
            }
        }
        for(int num:mp.keySet()){
            if(mp.get(num)==1){
                maxval=Math.max(maxval,num);
            }
        }
        return maxval;
    }
}