class Solution {
    public int minOperations(int[] nums, int x) {
        int t=0;
        for(int i:nums){
            t+=i;
        }
        int req=t-x;
        if(req==0){
            return nums.length;
        }
        if(req<0){
            return -1;
        }
        int l=0;
        int sum=0;
        int len=-1;

        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            while(sum>req){
                sum-=nums[l];
                l++;
            }
            if(sum==req){
                len=Math.max(len,i-l+1);
            }
        }
        if(len==-1){
            return -1;
        }

        return nums.length-len;
    }
}