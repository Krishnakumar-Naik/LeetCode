class Solution {
    public long gcd(int[] arr){
        // int mn=Integer.MAX_VALUE;
        long ans=0;
        for(int i:arr){
            ans=gcd2(ans,i);
        }
        return ans;

    }
    public long gcd2(long a,long b){
        while(b!=0){
            long t=b;
            b=a%b;
            a=t;
        }
        return a;
    }

    public long lcm(int[] arr){
        long pd=1;
        for(int i:arr){
            pd=(pd/gcd2(pd,i))*i;
        }
        return pd;
    }
    public long prod(int[] arr){
        long pd=1;
        for(int i:arr){
            pd*=i;
        }
        return pd;
    }

    public int maxLength(int[] nums) {
        int l=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                int[] a=Arrays.copyOfRange(nums,i,j+1);
                if(prod(a)==lcm(a)*gcd(a) && a.length>l){
                    l=a.length;
                }
            }
        }
        return l;
    }
}