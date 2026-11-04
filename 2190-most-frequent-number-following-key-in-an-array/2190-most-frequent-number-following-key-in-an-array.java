class Solution {
    public int mostFrequent(int[] nums, int key) {
        Map<Integer,Integer> hm=new HashMap<>();
        int max=0;
        int ans=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==key){
                hm.put(nums[i+1],hm.getOrDefault(nums[i+1],0)+1);

                if(hm.get(nums[i+1])>max){
                    max=hm.get(nums[i+1]);
                    ans=nums[i+1];
                }
            }
        }
        return ans;
    }
}