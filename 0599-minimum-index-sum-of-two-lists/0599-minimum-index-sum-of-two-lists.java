class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        ArrayList<String> ans=new ArrayList<>();
        int min=Integer.MAX_VALUE;
        for(int i=0;i<list1.length;i++){
            for(int j=0;j<list2.length;j++){
                if(list1[i].equals(list2[j])){
                    if((i+j)<min){
                        ans.clear();
                        ans.add(list1[i]);
                        min=i+j;
                    }else if((i+j)==min){
                        ans.add(list1[i]);
                    }
                }
            }
        }
        String[] f=new String[ans.size()];
        int k=0;
        for(String i:ans){
            f[k]=i;
            k++;
        }
        return f;
    }
}