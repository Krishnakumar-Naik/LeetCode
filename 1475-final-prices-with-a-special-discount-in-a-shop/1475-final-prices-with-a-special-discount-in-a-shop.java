class Solution {
    public int[] finalPrices(int[] prices) {
        int[] ans=new int[prices.length];
        for(int i=0;i<prices.length;i++){
            ans[i]=prices[i];
            for(int j=i+1;j<prices.length;j++){
                if(ans[i]>=prices[j]){
                    ans[i]=prices[i]-prices[j];
                    break;
                }
            }
        }
        return ans;
    }
}