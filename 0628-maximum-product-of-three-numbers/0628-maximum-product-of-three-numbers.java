class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int pd1=nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3];
        int pd2=nums[0]*nums[1]*nums[nums.length-1];
        return Math.max(pd1,pd2);
    }
}