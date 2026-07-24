class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int icount=0;
        int fcount=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                icount++;
                if(icount>fcount){
                    fcount=icount;
                }
            }else{
                icount=0;
            }
        }
        return fcount;
    }
}