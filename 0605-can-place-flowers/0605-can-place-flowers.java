class Solution {
    public boolean canPlaceFlowers(int[] flower, int n) {
        if(flower.length==1){
            if(flower[0]==0 && n<=1){
                return true;
            }
            if(flower[0]==1 && n==0){
                return true;
            }
            return false;
        }

        for(int i=0;i<flower.length;i++){

            if(n>0){

                if(i==0 && flower[i]==0 && flower[i+1]==0){
                    flower[i]=1;
                    n--;
                }
                else if(i==flower.length-1 && flower[i]==0 && flower[i-1]==0){
                    flower[i]=1;
                    n--;
                }

                else if(i>0 && i<flower.length-1 && flower[i]==0 && flower[i+1]==0 && flower[i-1]==0){
                    flower[i]=1;
                    n--;
                }

            }

        }
        return n==0;
    }
}