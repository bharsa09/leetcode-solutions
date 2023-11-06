class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        if(nums1.length<nums2.length){
            intersect(nums2,nums1);
        }
        List list=new ArrayList();
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i=0;
        int j=0;

        while(j<nums2.length && i<nums1.length){
            if(nums1[i]==nums2[j]){
                list.add(nums2[j]);
                i++;
                j++;
            }else if(nums2[j]>nums1[i]){
                i++;
            }else{
                j++;
            }
        }
        int[] arr=new int[list.size()];

        for(int k=0;k<list.size();k++){
            arr[k]=(int)list.get(k);
        }
        return arr;
    }
}