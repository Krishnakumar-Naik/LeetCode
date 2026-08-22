class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0;
        int prod=1;
        int val=n;
        while(n!=0){
            int r=n%10;
            sum+=r;
            prod*=r;
            n=n/10;
        }
        return val%(sum+prod)==0;
    }
}