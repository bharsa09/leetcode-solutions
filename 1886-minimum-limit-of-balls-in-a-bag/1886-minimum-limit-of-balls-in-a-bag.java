class Solution {
    public int minimumSize(int[] nums, int maxOperations) {
        int low=1;
        int high=Integer.MIN_VALUE;

        for(int i:nums){
            low=Math.min(low,i);
            high=Math.max(high,i);
        }

        while(low<=high){
            int mid=low+(high-low)/2;

            if(isPossible(nums,mid,maxOperations)){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return low;
    }

    boolean isPossible(int[] arr,int penalty,int ops){
        int count=0;

        for(int i=0;i<arr.length;i++){
          count+=(arr[i]-1)/penalty;
        }
        return count<=ops;
    }
    
}