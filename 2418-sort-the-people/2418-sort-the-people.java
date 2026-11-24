class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        Map<Integer,String> hm=new HashMap<>();
        for(int i=0;i<heights.length;i++){
            hm.put(heights[i],names[i]);
        }
        String[] ans=new String[names.length];
        for(int j=0;j<names.length;j++){
            String k=hm.get(Collections.max(hm.keySet()));
            ans[j]=k;
            hm.remove(Collections.max(hm.keySet()));
        }
        return ans;

    }
}