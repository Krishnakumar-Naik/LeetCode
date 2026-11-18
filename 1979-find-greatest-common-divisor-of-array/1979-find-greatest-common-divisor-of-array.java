class Solution {
    public int findGCD(int[] nums) {
        int mx=Integer.MIN_VALUE;
        int mn=Integer.MAX_VALUE;
        for(int i:nums){
            if(i>mx) mx=i;
            if(i<mn) mn=i;
        }
        while(mx!=0 && mn!=0){
            if(mx>mn) mx=mx%mn;
            else mn=mn%mx;
        }

        if(mx!=0) return mx;
        return mn;
        
    }
}