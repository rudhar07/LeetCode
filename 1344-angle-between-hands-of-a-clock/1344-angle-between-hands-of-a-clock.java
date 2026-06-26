class Solution {
    public double angleClock(int hour, int minutes) {
        double hp = (hour*30)+(minutes*0.5);
        double mp = minutes*6;
        double d = Math.abs(mp-hp);
        if(d<=180)return d;
        return 360.0-d;
    }
}