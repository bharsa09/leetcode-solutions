class Solution {
    public int minDays(int[] bloomDay, int m, int k) {

        if((long)m*k>bloomDay.length) return -1;

        int low=Integer.MAX_VALUE;
        int high=Integer.MIN_VALUE;

        for(int i:bloomDay){
            low=Math.min(low,i);
            high=Math.max(high,i);
        }
        while(low<=high){
            int mid=low+(high-low)/2;

            if(IsPossible(bloomDay,m,k,mid)){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return low;
        
    }

    boolean IsPossible(int[] arr,int m,int k,int days){

        int win=0;

        for(int i=0;i<arr.length;i++){
            if(days>=arr[i]){
                win++;

                if(win==k){
                    m--;
                    if(m==0){
                        return true;
                    }
                    win=0;
                }
            }else{
                win=0;
            }
        }

        return false;
    }
}