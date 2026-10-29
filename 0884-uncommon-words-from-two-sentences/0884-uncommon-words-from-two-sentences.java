class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        HashMap<String, Integer> hm=new HashMap<>();
        String[] ar1=s1.split(" ");
        String[] ar2=s2.split(" ");
        for(int i=0;i<ar1.length;i++){
                hm.put(ar1[i], hm.getOrDefault(ar1[i], 0) + 1);
        }
        for(int i=0;i<ar2.length;i++){
                hm.put(ar2[i], hm.getOrDefault(ar2[i], 0) + 1);
        }
        List<String> ans=new ArrayList<>();
        for (String w : hm.keySet()) {
            if (hm.get(w) == 1) {
                ans.add(w);
            }
        }
        return ans.toArray(new String[0]);
    }
}