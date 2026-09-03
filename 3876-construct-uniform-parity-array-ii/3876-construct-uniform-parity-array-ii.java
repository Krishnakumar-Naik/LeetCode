class Solution {
    public boolean uniformArray(int[] nums1) {
        int min=nums1[0];
        int even=0,odd=0;

        for(int i=0;i<nums1.length;i++){
            if(nums1[i]<min){
                min=nums1[i];
            }
            if(nums1[i]%2==0){
                even++;
            }else{
                odd++;
            }
        }
        
        if(even==nums1.length) return true;
        if(odd==nums1.length) return true;

        if(min%2!=0){
            return true;
        }
        return false;
    }
}