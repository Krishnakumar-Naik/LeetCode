class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        
        int c=0;
        for(int i:arr1){
            int c2=0;
            for(int j:arr2){
                if(Math.abs(i-j)>d){
                    c2++;
                }
            }
            if(c2==arr2.length){
                c++;
            }
        }
        return c;
    }
}