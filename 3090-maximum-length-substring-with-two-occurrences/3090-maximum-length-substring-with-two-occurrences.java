class Solution {
    public int maximumLengthSubstring(String s) {
        HashMap<Character,Integer> c=new HashMap<>();
        int left=0;int max=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            c.put(ch,c.getOrDefault(ch,0)+1);

            while(c.get(ch)>2){
                char leftpoint=s.charAt(left);
                c.put(leftpoint,c.get(leftpoint)-1);
                left++;
            }
            max=Math.max(max,i-left+1);
        }
        return max;
    }
}