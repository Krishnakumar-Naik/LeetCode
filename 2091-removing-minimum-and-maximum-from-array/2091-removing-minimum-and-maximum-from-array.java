class Solution {
    public int minimumDeletions(int[] nums) {
        int maxvl=0;int minvl=0;
        int n=nums.length;
        for(int i=1;i<n;i++){
            if(nums[minvl]>nums[i]){
                minvl=i;
            }
            if(nums[maxvl]<nums[i]){
                maxvl=i;
            }
        }
        int right=Math.max(maxvl,minvl);
        int left=Math.min(maxvl,minvl);

        int front=right+1;
        int back=n-left;

        int both=(n-right)+(left+1);
        return Math.min(front,Math.min(both,back));
    }
}