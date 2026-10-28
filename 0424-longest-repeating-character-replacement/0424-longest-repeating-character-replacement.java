class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq=new int[26];
        int left=0;
        int maxf=0;
        int maxl=0;
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'A']++;
            maxf=Math.max(maxf,freq[s.charAt(i)-'A']);
            while((i-left+1)-maxf>k){
                freq[s.charAt(left)-'A']--;
                left++;
            }
            maxl=Math.max(maxl,i-left+1);
        }
        return maxl;
    }
}