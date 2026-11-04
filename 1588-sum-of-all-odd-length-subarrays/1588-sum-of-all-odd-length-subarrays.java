class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        
        int max=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int sum=0;int l=0;
                for(int k=i;k<=j;k++){
                    l++;
                    sum+=arr[k];
                }
                if(l%2!=0){
                    max+=sum;
                }
            }
        }
        return max;
    }
}