class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int totalWeight=0;
        int maxWeight=-1;

        for(int w:weights){
            totalWeight+=w;
            maxWeight=Math.max(maxWeight,w);
        }

        int low=maxWeight;
        int high=totalWeight;

        

        while(low<=high){
            int mid=(low+high)/2;

            int d=calculateDays(weights,mid);
            //System.out.println(mid+" "+d);

            if(d<=days){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return low;
        
    }

    public int calculateDays(int[] weights, int kg){

        int days=1;

        int sum=0;

        for(int i=0;i<weights.length;i++){
            if(sum+weights[i]>kg){
                days++;
                sum=0;
            }
            sum+=weights[i];
        }
        return days;
    }
}