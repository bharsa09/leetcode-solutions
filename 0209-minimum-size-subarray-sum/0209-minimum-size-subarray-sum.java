class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        int i=0;
        int j=0;
        int len=nums.length;
        int sum=0;
        int res=Integer.MAX_VALUE;

        while(i<=j){
            if(sum<target){
                if(j>=len) break;
                sum=sum+nums[j];
                j++;
            }else{
                res=Math.min(res,j-i);
                sum=sum-nums[i];
                i++;
            } 
        }
        return res==Integer.MAX_VALUE?0:res; 
    }
}