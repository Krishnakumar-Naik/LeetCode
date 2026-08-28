class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        List<Integer> ans=new ArrayList<>();

        for(int i:nums1){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        
        for(int num:nums2){
            if(hm.getOrDefault(num,0)>0){
                ans.add(num);
                hm.put(num,hm.getOrDefault(num,0)-1);
            }
        }

        int[] res=new int[ans.size()];
        int i=0;
        for(int n:ans){
            res[i++]=n;
        }
        return res;
    }
}