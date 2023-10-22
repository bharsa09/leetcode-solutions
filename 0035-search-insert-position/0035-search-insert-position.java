class Solution {
    public int searchInsert(int[] nums, int target) {

        int res=-1;
        int low=0;
        int high=nums.length-1;

        while(low<=high){
            int mid=low+(high-low)/2;

            //System.out.println("low-->"+low+" "+"high-->"+high);

            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]>target){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return low;
        
    }
}