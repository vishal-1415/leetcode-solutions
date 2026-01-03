class Solution {
    public int numberOfSteps(int num) {
        int step = 0;
        while(0<num){
            if(num == 0){
                return step;
            }
            if(num%2==0){
                num /= 2;
                step++;
            }
            else{
                num -= 1;
                step++;
            }
        }
        return step;
    }
}