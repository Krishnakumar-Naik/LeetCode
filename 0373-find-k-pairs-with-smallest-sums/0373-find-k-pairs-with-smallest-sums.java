class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<List<Integer>> res=new ArrayList<>();
        PriorityQueue<int[]> qu=new PriorityQueue<>(
            (a,b) -> Integer.compare(a[0],b[0])
        );

        for(int i=0;i<nums1.length && i<k;i++){
            qu.offer(new int[]{nums1[i]+nums2[0],i,0});
        }

        while(k>0 && !qu.isEmpty()){
            int[] curr=qu.poll();
            int sum=curr[0];
            int i=curr[1];
            int j=curr[2];

            res.add(Arrays.asList(nums1[i],nums2[j]));

            if(j+1<nums2.length){
                qu.offer(new int[]{nums1[i]+nums2[j+1],i,j+1});
            }
            k--;
        }
        return res;

    }
}