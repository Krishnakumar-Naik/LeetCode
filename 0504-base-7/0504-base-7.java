class Solution {
    public String convertToBase7(int num) {
        if(num==0){
            return "0";
        }
        long n=Math.abs((long)num);
        StringBuilder sb=new StringBuilder();
        boolean b=(num<0);

        while(n>0){
            sb.append(n%7);
            n/=7;
        }
        if(b){
            sb.append('-');
        }

        return sb.reverse().toString();
    }
}