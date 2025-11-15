class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        int a = 0;
        int b = numbers.length -1;
        int current_sum =0 ;
        while(a<b){
            current_sum = numbers[a] + numbers[b];
            if (current_sum==target){
                return new int[] {a+1,b+1};
           }
            else if(current_sum > target)
            {
                    b = b-1;
            }
            else if(current_sum < target)
            {
                a = a+1;
            }     
        }
        return new int[] {};
    }
}