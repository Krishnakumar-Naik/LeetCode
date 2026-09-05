class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int[] suf=new int[nums.length];
        suf[nums.length-1]=nums[nums.length-1];
        for(int i=nums.length-2;i>=0;i--){
            suf[i]=Math.min(suf[i+1],nums[i]);
        }
        int pref=nums[0];
        for(int i=0;i<=nums.length-1;i++){
            pref=Math.max(pref,nums[i]);

            if(pref-suf[i]<=k){
                return i;
            }
        }

        return -1;
    }
}