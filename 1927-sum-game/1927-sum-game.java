class Solution {
    public boolean sumGame(String num) {
        int n=num.length();
        int half=n/2;
        int sum1=0;int sum2=0;
        int q1=0;int q2=0;

        for(int i=0;i<n;i++){
            if(i<half){
                if(num.charAt(i)=='?'){
                    q1++;
                }else{
                    sum1+=num.charAt(i)-'0';
                }
            }else{
                if(num.charAt(i)=='?'){
                    q2++;
                }else{
                    sum2+=num.charAt(i)-'0';
                }
            }
        }
        int digdiff=sum1-sum2;
        int qdiff=q1-q2;

        return 2*digdiff+9 *qdiff !=0;
    }
}