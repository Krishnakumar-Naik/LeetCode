class Solution {
    public int smallestNumber(int n, int t) {
        
        for(int i=n; ;i++){
            int prod=1;
            int val=i;
            while(val!=0){
                int r=val%10;
                prod*=r;
                val/=10;
            }
            if(prod%t==0){
                return i;
            }
        }
    }
}