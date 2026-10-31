class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        paragraph=paragraph.toLowerCase();
        paragraph = paragraph.replaceAll("[^a-z]", " ");
        String[] w = paragraph.trim().split("\\s+");
        HashSet<String> st=new HashSet<>();
        Map<String,Integer> hm=new HashMap<>();
        int max=0;String ans="";
        for(String k:banned){
            st.add(k);
        }
        for(String m:w){
            if(!st.contains(m)){
                int c=hm.getOrDefault(m,0)+1;
                hm.put(m,c);
                if(c>max){
                    max=c;
                    ans=m;
                }
            }
        }
        return ans;
    }
}