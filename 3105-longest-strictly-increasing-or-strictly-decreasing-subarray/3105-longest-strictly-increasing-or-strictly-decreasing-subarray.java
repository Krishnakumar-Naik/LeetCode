class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int ans=1;
        int c=1;
        int h=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                c++;
                h=1;
            }else if(nums[i]<nums[i-1]){
                h++;
                c=1;
            }else{
                c=1;
                h=1;
            }
            ans=Math.max(ans,Math.max(c,h));
        }
        return ans;
    }
}