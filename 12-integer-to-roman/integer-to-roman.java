class Solution {
    public String intToRoman(int num) {
        String[] symbols = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
        int[] number = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };

        String roman = "";
        for (int i = 0; i < number.length; i++) {
            while (num >= number[i]) {              //TC:O(1)  SC:O(1)
                num -= number[i];
                roman += symbols[i];
            }
        }
        return roman;
    }
}