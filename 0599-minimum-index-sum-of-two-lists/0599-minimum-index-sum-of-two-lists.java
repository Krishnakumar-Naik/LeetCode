class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        // ArrayList<String> ans=new ArrayList<>();
        // int min=Integer.MAX_VALUE;
        // for(int i=0;i<list1.length;i++){
        //     for(int j=0;j<list2.length;j++){
        //         if(list1[i].equals(list2[j])){
        //             if((i+j)<min){
        //                 ans.clear();
        //                 ans.add(list1[i]);
        //                 min=i+j;
        //             }else if((i+j)==min){
        //                 ans.add(list1[i]);
        //             }
        //         }
        //     }
        // }
        // String[] f=new String[ans.size()];
        // int k=0;
        // for(String i:ans){
        //     f[k]=i;
        //     k++;
        // }
        // return f;

        HashMap<String,Integer> hm=new HashMap<>();

        for(int i=0;i<list1.length;i++){
            for(int j=0;j<list2.length;j++){
                if(list1[i].equals(list2[j])){
                    hm.put(list1[i],i+j);
                }
            }
        }
        int min=Integer.MAX_VALUE;
        for(int i:hm.values()){
            if(i<min){
                min=i;
            }
        }
        int c=0;
        for(int i:hm.values()){
            if(i==min){
                c++;
            }
        }
        String[] ans=new String[c];int k=0;
        for(String d:hm.keySet()){
            if(hm.get(d)==min){
                ans[k]=d;k++;
            }
        }
        return ans;
    }
}