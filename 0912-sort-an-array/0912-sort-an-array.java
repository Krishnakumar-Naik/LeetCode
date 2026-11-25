class Solution {

    public int[] merge(int[] a,int[] b,int[] res){
        int i=0,j=0,k=0;
        while(i<a.length && j<b.length){
            if(a[i]<b[j]){
                res[k++]=a[i++];
            }else{
                res[k++]=b[j++];
            }
        }
        while(i<a.length){
            res[k++]=a[i++];
        }
        while(j<b.length){
            res[k++]=b[j++];
        }
        return res;
    }

    public int[] divide(int[] arr){
        if(arr.length==1){
            return arr;
        }
        int[] left=new int[arr.length/2];
        int[] right=new int[arr.length-(arr.length/2)];
        for(int i=0;i<arr.length/2;i++){
            left[i]=arr[i];
        }
        for(int i=arr.length/2;i<arr.length;i++){
            right[i-arr.length/2]=arr[i];
        }
        left=divide(left);
        right=divide(right);
        return merge(left,right,arr);
    }

    public int[] sortArray(int[] nums) {
        divide(nums);
        return nums;
    }
}