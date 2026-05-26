class Solution {
    public String categorizeBox(int length, int width, int height, int mass) {
        if(isBulky(length,width,height) && mass >= 100){
            return "Both";
        }else if(isBulky(length,width,height)){
            return "Bulky";
        }else if(mass >= 100){
            return "Heavy";
        }else{
            return "Neither";
        }
    }
    private static boolean isBulky(int length, int width, int height){
        long volume = (long)length*width*height;

        if(length >= 10000|| width >= 10000 || height >= 10000 || volume >= 1000000000L){
            return true;
        }else{
            return false;
        }
    }
}