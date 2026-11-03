class Solution {
    public int minMoves(int[] nums) {
        int mx=0;
        for(int i:nums){
            if(i>mx){
                mx=i;
            }
        }
        int sum=0;
        for(int i:nums){
            sum+=mx-i;
        }
        return sum;
    }
}