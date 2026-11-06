class Solution {
    public int arrayPairSum(int[] nums) {
        int mx=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i=i+2){
            mx+=nums[i];
        }
        return mx;
    }
}