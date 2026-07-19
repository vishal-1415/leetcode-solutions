class Solution {
    public String kthDistinct(String[] arr, int k) {
        HashMap<String,Integer> map = new HashMap<>();
        for (String num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int count = 0;
        for(String s : arr){
            if(map.get(s) == 1){
                count++;
            }
            if(count == k){
                return s;
            }
        }

    return "";
    }
}