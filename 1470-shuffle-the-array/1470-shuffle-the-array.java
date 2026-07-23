class Solution {
    public int[] shuffle(int[] nums, int n) {
        int size=nums.length;
        // int[] arr1=new int[n];
        // int[] arr2=new int[n];
        int[] ans=new int[size];

        for(int i=0;i<n;i++){
            ans[2*i]=nums[i];
            ans[2*i+1]=nums[n+i];
        }        
        // int k=0; int m=0;
        // for(int i=0;i<size;i++){
        //     if((i+1)%2==0){
        //         ans[i]=arr2[k];
        //         k++;
        //     }
        //     else{
        //         ans[i]=arr1[m];
        //         m++;
        //     }
        // }
        return ans;
        
    }
}