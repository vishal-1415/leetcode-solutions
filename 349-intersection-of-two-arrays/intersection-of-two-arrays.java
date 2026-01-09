class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        Set<Integer> setCopy = new HashSet<>();
        Set<Integer> ans = new HashSet<>();

        for(int num : nums1){
            setCopy.add(num);
        }

        for(int num : nums2){
            if(setCopy.contains(num)){
                ans.add(num);
            }
        }

        int[] result = new int[ans.size()];
        int i =0;
        for(int num:ans){
            result[i] = num;
            i++;
        }

         return result;   
    }
}