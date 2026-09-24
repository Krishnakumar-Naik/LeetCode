class Solution {
    public int smallestIndex(int[] nums) {
        int sum;
        for(int i=0;i<nums.length;i++){
            sum=0;
            int val=nums[i];
            while(val!=0){
                int r=val%10;
                sum+=r;
                val/=10;
            }
            if(sum==i){
                return i;
            }
        }
        return -1;
    }
}