class Solution {
    public boolean increasingTriplet(int[] nums) {
        int[] pref=new int[nums.length];
        int[] suf=new int[nums.length];
        
        pref[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            pref[i]=Math.min(nums[i],pref[i-1]);
        }
        suf[nums.length-1]=nums[nums.length-1];
        for(int j=nums.length-2;j>=0;j--){
            suf[j]=Math.max(nums[j],suf[j+1]);
        }
        for(int i=1;i<nums.length-1;i++){
            if(pref[i-1]<nums[i] && nums[i]<suf[i+1]){
                return true;
            }
        }
        return false;
    }
}