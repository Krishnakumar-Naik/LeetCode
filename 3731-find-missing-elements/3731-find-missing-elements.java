class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int min=nums[0];
        int max=nums[0];
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            min=Math.min(min,nums[i]);
            max=Math.max(max,nums[i]);
        }
        int k=0;
        Arrays.sort(nums);
        for(int i=min;i<max;i++){
            if(i==nums[k]){
                k++;
            }else{
                ans.add(i);
            }
        }
        return ans;
        
    }
}