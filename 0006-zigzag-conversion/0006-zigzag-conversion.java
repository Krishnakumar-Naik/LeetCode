class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1 || numRows>=s.length()){
            return s;
        }

        StringBuilder[] st=new StringBuilder[numRows];
        for(int i=0;i<numRows;i++){
            st[i]=new StringBuilder();
        }
        int row=0;
        int count=1;

        for(int i=0;i<s.length();i++){
            st[row].append(s.charAt(i));

            if(row==0){
                count=1;
            }else if(row==numRows-1){
                count=-1;
            }
            row+=count;
        }

        StringBuilder ans=new StringBuilder();
        for(int i=0;i<numRows;i++){
            ans.append(st[i]);
        }

        return ans.toString();
        
    }
}