class Solution {
    public String reverseVowels(String s) {
        char[] cr=s.toCharArray();
        int i=0;int j=s.length()-1;

        while(i<j){

            while(i<s.length()){
                if(cr[i]=='A' || cr[i]=='E' || cr[i]=='I' || cr[i]=='O'||cr[i]=='U'){
                    break;
                }else if(cr[i]=='a' || cr[i]=='e' || cr[i]=='i' || cr[i]=='o'||cr[i]=='u'){
                    break;
                }
                i++;

            }
            while(j>=0){
                if(cr[j]=='A' || cr[j]=='E' || cr[j]=='I' || cr[j]=='O'||cr[j]=='U'){
                    break;
                }else if(cr[j]=='a' || cr[j]=='e' || cr[j]=='i' || cr[j]=='o'||cr[j]=='u'){
                    break;
                }
                j--;
            }

            if(i<j){
                char k=cr[i];
                cr[i]=cr[j];
                cr[j]=k;
                i++;
                j--;
            }
        }
        return new String(cr);
    }
}