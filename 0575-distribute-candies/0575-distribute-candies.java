class Solution {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> s=new HashSet<>();
        for(int i:candyType){
            s.add(i);
        }
        int l=candyType.length/2;
        if(s.size()>l){
            return l;
        }else{
            return s.size();
        }

    }
}