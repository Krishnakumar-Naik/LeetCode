class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans=new ArrayList<>();
        int[] arr=new int[nums.length];
        for(int num:nums){
            arr[num-1]=1;
        }
        for(int i=0;i<nums.length;i++){
            if(arr[i]==0){
                ans.add(i+1);
            }
        }
        return ans;
    }
}