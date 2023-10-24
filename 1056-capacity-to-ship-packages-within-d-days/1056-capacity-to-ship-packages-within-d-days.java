class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int totalWeight=0;
        int maxWeight=-1;

        for(int w:weights){
            totalWeight+=w;
            maxWeight=Math.max(maxWeight,w);
        }
        //why we have taken this as maxweight?
        /*

        take this example [1,2,3,1,1].   if we take low as 0

        1st iteration mid===>4
        2nd itertion mid=2. Here we have issue because 3 in belt will never albe to load
        so we have to take that weight so all the weight can be loaded one by one in worst case
        so we choose the max weight in the array

        */

        int low=maxWeight;
        int high=totalWeight;

        while(low<=high){
            int mid=(low+high)/2;
            int d=calculateDays(weights,mid);

            if(d<=days){
                //while adjusting high and low be carefull 
                //if calculatedDays is lesser than given date or equal then it means we have taken
                //min weight is very large thats why calculate day is less
                //so we have to reduce the weight
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