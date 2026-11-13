class Solution {
    public int dayOfYear(String date) {
        int[] arr={31,28,31,30,31,30,31,31,30,31,30,31};
        int month=Integer.parseInt(date.substring(5,7));
        int d=Integer.parseInt(date.substring(8));
        int year=Integer.parseInt(date.substring(0,4));
        int sum=0;
        if(month>2){
            if(year%400==0 || (year%4==0 && year%100!=0)) sum+=1;
        }
        for(int i=0;i<month-1;i++){
            sum+=arr[i];
        }
        return sum+d;
    }
}