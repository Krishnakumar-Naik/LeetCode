class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.size();i++){
            for(int j=0;j<nums.size();j++){
                int sum=0;int c=0;
                for(int k=i;k<=j;k++){
                    sum+=nums.get(k);
                    c++;
                }
                if(sum>0 && sum<min && c>=l && c<=r){
                    min=sum;
                }
            }
        }
        if(min==Integer.MAX_VALUE) return -1;
        return min;
    }
}