class Solution {
    public String stoneGameIII(int[] stoneValue) {
        int n=stoneValue.length;
        int[] ak=new int[n+1];

        for(int i=n-1;i>=0;i--){
            int sum=0;
            ak[i]=Integer.MIN_VALUE;
            for(int k=0;k<3 && i+k<n;k++){
                sum+=stoneValue[i+k];
                ak[i]=Math.max(ak[i],sum-ak[i+k+1]);
            }
        }
        if(ak[0]>0){
            return "Alice";
        }else if(ak[0]<0){
            return "Bob";
        }else{
            return "Tie";
        }
    }
}