class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a, b) -> b[1] - a[1]);

        int Maximum_Units = 0;
        for (int[] box : boxTypes) {
            int boxes = box[0];
            int unitsinBox = box[1];

            int taken = Math.min(boxes, truckSize);
            Maximum_Units += taken * unitsinBox;

            truckSize -= taken;

            if (truckSize == 0)
                break;
        }
        return Maximum_Units;
    }
}