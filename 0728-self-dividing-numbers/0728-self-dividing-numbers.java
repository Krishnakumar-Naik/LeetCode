class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> l=new ArrayList<>();
        for(int i=left;i<=right;i++){
            int val=i;int org=i;
            while(val!=0){
                int r=val%10;
                if(r==0 || org%r!=0 ){
                    break;
                }
                val/=10;
                if(val==0){
                    l.add(i);
                }
            }
        }
        return l;
    }
}