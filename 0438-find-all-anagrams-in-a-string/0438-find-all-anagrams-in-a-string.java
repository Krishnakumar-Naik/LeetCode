class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> al=new ArrayList();
        if(s.length()<p.length()){
            return al;
        }

        int[] a=new int[26];
        int[] b=new int[26];
        for(int i=0;i<p.length();i++){
            a[p.charAt(i)-'a']++;
            b[s.charAt(i)-'a']++;
        }

        for(int i=0;i<=s.length()-p.length();i++){
            if(Arrays.equals(a,b)){
                al.add(i);
            }
            if(i+p.length()<s.length()){
                b[s.charAt(i)-'a']--;
                b[s.charAt(i+p.length())-'a']++;
            }

        }

        return al;
    }
}