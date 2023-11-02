class Solution {
    public int minimizedMaximum(int n, int[] quantities) {

        int low=1;  //minimum product to a store
        int high=Integer.MIN_VALUE;

        for(int i: quantities) high=Math.max(high,i);
    
        while(low<=high){
            int mid=(high+low)/2;
            if(canDistribute(quantities,n,mid)) high=mid-1;
            else low=mid+1;
        }
        return low;
    }

    boolean canDistribute(int[] arr,int n,int item){

        for(int i=0;i<arr.length;i++){
            n=n-(arr[i]/item);
            if(arr[i]%item!=0) n--;
            if(n<0) return false;
        }
        return true;
    }
}