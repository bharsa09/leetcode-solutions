class Solution {
    public long minimumTime(int[] time, int totalTrips) {

        long minTime=time[0];

        for(int t:time){
            minTime=Math.min(minTime,t);
        }

        long low=1;
        long high=totalTrips*minTime;

        while(low<=high){
            long mid= low+(high-low)/2;

            long total=calculateTrip(time,mid);

            if(total<totalTrips){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return low;
    }

    long calculateTrip(int[] time,long givenTime){

        long res=0;

        for(int t:time){
            res=res+ ((long)givenTime/t);
        }
        return res;
    }
}