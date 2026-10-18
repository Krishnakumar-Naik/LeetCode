class Solution {
    public boolean checkIfExist(int[] arr) {
        for(int i=0;i<arr.length;i++){
            double h=(double)arr[i]/2;
            for(int j=0;j<arr.length;j++){
                if(i!=j && arr[j]==h){
                    return true;
                }
            }
        }
        return false;
    }
}