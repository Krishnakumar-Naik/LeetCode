class Solution {
    public int numberOfChild(int n, int time) {
         int flag=0;int c=0;
        
        for(int i = 1; i <= time; i++) {
            if(flag == 0) {
                c++;
                if(c == n-1) {
                    flag = 1;
                }
            }
            else {
                c--;
                if(c == 0) {
                    flag = 0;
                }
            }
        }

        return c;
    }
}