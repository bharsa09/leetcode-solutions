class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int len=nums.length;
        int low=1;
        int high=len;

        
        int min=0;

        while(low<=high){
            int mid=(high+low)/2;
            

            if(windowSum(nums,mid,target)){
                high=mid-1;
               min=mid;
            }else{
                low=mid+1;
            }
           
        }
        return min;
    }

    boolean windowSum(int[] arr,int size,int target){
        int sum=0;

        for(int i=0;i<arr.length;i++){
            if(i>=size){
                sum=sum-arr[i-size];
            }
            sum=sum+arr[i];

            if(sum>=target){
                return true;
            }

        }

        
        return false;

    }
}





