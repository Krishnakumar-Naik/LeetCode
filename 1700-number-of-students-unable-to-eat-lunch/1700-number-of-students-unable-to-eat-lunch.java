class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int[] c=new int[2];
        for(int std:students){
            c[std]++;
        }
        for(int sand:sandwiches){
            if(c[sand]==0){
                break;
            }
            c[sand]--;
        }
        return c[0]+c[1];
    }
}