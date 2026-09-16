class Solution {
    public char findTheDifference(String s, String t) {
        ArrayList<Character> hs=new ArrayList<>();
        for(char c:s.toCharArray()){
            hs.add(c);
        }
        for(char c:t.toCharArray()){
            if(hs.contains(c)){
                hs.remove((Character)c);
            }else{
                return c;
            }
        }
        return ' ';
    }
}