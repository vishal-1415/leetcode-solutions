class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        ArrayList<Integer> ans = new ArrayList<>();
        int left = 0;
        int right = 0;
        while(left<nums1.length && right<nums2.length){

            if(nums1[left] < nums2[right]){
                left++;
            }else if(nums1[left] > nums2[right]){
                right++;
            }else{
                ans.add(nums1[left]);
                left++;
                right++;
            }
        }

        int[] result = new int[ans.size()];
        int k =0;
        while(k<ans.size()){
            result[k] = ans.get(k);
            k++;
        }

        return result;
    }
}