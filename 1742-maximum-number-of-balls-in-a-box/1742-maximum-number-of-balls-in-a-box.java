class Solution {
    public int countBalls(int lowLimit, int highLimit) {
        int ans=Integer.MIN_VALUE;
        Map<Integer,Integer> hm=new HashMap<>();
        for(int i=lowLimit;i<=highLimit;i++){
            int k=i;int sum=0;
            while(k!=0){
                int r=k%10;
                sum+=r;
                k/=10;
            }

            hm.put(sum,hm.getOrDefault(sum,0)+1);
            if(hm.get(sum)>ans) ans=hm.get(sum);
            
        }
        // for(Map.Entry<Integer,Integer> e:hm.entrySet()){
        //     if(e.getValue()>ans){
        //         ans=e.getValue();
        //     }
        // }

        return ans;
    }
}