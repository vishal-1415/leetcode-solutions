class Solution {
    public double angleClock(int hour, int minutes) {
        
        double MinAngle = 6 * minutes;

        double hrAngle = 30 * (hour % 12) + 0.5 * minutes;

        double Angle = Math.abs(hrAngle - MinAngle);

    return Math.min(Angle,360 - Angle);
    }
}