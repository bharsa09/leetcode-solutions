class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        //assuming nums1 length is bigger

        if(nums1.length<nums2.length){
            intersection(nums2,nums1);
        }
        HashSet<Integer> set=new HashSet();
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        for(int i=0;i<nums2.length;i++){
            int target=nums2[i];
            int low=0;
            int high=nums1.length-1;

            while(low<=high){
                int mid=(high+low)/2;

                if(nums1[mid]==target){
                    set.add(target);
                    break;
                }else if(nums1[mid]>target){
                    high=mid-1;
                }else{
                    low=mid+1;
                }
            }

        }

        int arr[] = new int[set.size()];
        int j=0;
        
        for(int i:set){
            arr[j]=i;
            j++;
        }
        return arr;
        
    }
}