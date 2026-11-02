class Solution {
    public int minMoves2(int[] nums) {
        int c=0;
        Arrays.sort(nums);
        int mid=nums[nums.length/2];
        for(int i:nums){
            c+=Math.abs(i-mid);
        }
        return c;
    }
}