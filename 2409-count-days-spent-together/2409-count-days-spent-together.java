class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int[] m={31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        int alam=Integer.parseInt(arriveAlice.substring(0,2));
        int alad=Integer.parseInt(arriveAlice.substring(3));
        int alem=Integer.parseInt(leaveAlice.substring(0,2));
        int aled=Integer.parseInt(leaveAlice.substring(3));
        
        int bbam=Integer.parseInt(arriveBob.substring(0,2));
        int bbad=Integer.parseInt(arriveBob.substring(3));
        int bbem=Integer.parseInt(leaveBob.substring(0,2));
        int bbed=Integer.parseInt(leaveBob.substring(3));

        int alc1=alad;
        for(int i=0;i<alam-1;i++){
            alc1+=m[i];
        }
        int alc2=aled;
        for(int i=0;i<alem-1;i++){
            alc2+=m[i];
        }
        int bbc1=bbad;
        for(int i=0;i<bbam-1;i++){
            bbc1+=m[i];
        }
        int bbc2=bbed;
        for(int i=0;i<bbem-1;i++){
            bbc2+=m[i];
        }
        int st=Math.max(alc1,bbc1);
        int ed=Math.min(alc2,bbc2);

        return Math.max(0,ed-st+1);

    }
}