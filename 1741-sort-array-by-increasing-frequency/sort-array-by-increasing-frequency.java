class Solution {
    public int[] frequencySort(int[] nums) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
             list.add(num);
        }


        // Step 2: Sort with custom comparator
        Collections.sort(list, (a, b) -> {
            int freqA = freqMap.get(a);
            int freqB = freqMap.get(b);

            if (freqA != freqB) {
                return freqA - freqB; // lower frequency first
            } else {
                return b - a; // smaller number first
            }

        });
        for(int i = 0;i<list.size();i++){
            nums[i] = list.get(i);
        }

        return nums;
    }
}