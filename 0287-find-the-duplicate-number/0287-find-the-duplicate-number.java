class Solution {
    public int findDuplicate(int[] nums) {

        int low=0;
        int high=nums.length;

        while(low<high){
            int mid=(low+high)/2;

            int count=0;
            for(int i : nums){
                if(i<=mid)count++;
            }

            if(count>mid){
                high=mid;
            }else{
                low=mid+1;
            }
        }
        return low;
        
    }
}