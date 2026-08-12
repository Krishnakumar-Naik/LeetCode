class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer, Integer> m=new HashMap<>();
        int left=0;int max1=0;
        for(int i=0;i<nums.length;i++){
            m.put(nums[i],m.getOrDefault(nums[i],0)+1);
            while(m.get(nums[i])>k){
                m.put(nums[left],m.get(nums[left])-1);
                left++;
            }
            max1=Math.max(max1,i-left +1);
        }
        return max1;
    }
}