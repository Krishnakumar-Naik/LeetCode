class Solution {
    public int sumCounts(List<Integer> nums) {
        int sum=0;
        for(int i=0;i<nums.size();i++){
            for(int j=i;j<nums.size();j++){
                HashSet<Integer> st=new HashSet<>();
                for(int k=i;k<j+1;k++){
                    st.add(nums.get(k));
                }
                int l=st.size();
                sum+=l*l;
            }
        }
        return sum;
    }
}