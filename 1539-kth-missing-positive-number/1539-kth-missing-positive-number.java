class Solution {
    public int findKthPositive(int[] arr, int k) {
        int[] ans=new int[k];int m=0;
        for(int i=1;i<=arr.length+k && m<k;i++){
            boolean flag=false;
            for(int j=0;j<arr.length;j++){
                if(i==arr[j]){
                    flag=true;
                    break;
                }
            }
            if(!flag){
                ans[m]=i;
                m++;
            }
        }
        return ans[k-1];
    }
}