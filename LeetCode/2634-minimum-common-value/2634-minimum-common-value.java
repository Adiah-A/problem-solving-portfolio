class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int ptr1 = 0, ptr2 = 0;
        int n1 = nums1.length, n2 = nums2.length;
        int res = -1;

        while(ptr1 < n1 && ptr2 < n2){
            if(nums1[ptr1] != nums2[ptr2]){
                if(nums1[ptr1] > nums2[ptr2]){
                    ptr2 ++;
                }else{
                    ptr1 ++;
                }
            }else{
                return nums1[ptr1];
            }
           
        }

        return res;
    }
}