class Solution {
    public int longestConsecutive(int[] nums) {

        Set<Integer> set = new HashSet<>();
        for(int i = 0;i<nums.length;i++){
            set.add(nums[i]);
        }

        int Long_Sequence = 0;
        for(int num : set){

            if(!set.contains(num - 1)){

                int curr_num = num;
                int curr_len = 1;

                while(set.contains(curr_num + 1)){
                    curr_num++;
                    curr_len++;

                }

                Long_Sequence = Math.max(curr_len,Long_Sequence);
            }
        }
    return Long_Sequence;
    }
}