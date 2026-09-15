class Solution {
    public int passThePillow(int n, int time) {
        int flag=0;int c=1;
        
        for(int i = 1; i <= time; i++) {
            if(flag == 0) {
                c++;
                if(c == n) {
                    flag = 1;
                }
            }
            else {
                c--;
                if(c == 1) {
                    flag = 0;
                }
            }
        }

        return c;
    }
}