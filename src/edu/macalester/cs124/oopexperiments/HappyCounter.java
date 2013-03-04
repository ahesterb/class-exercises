package edu.macalester.cs124.oopexperiments;

public class HappyCounter {
    private int x;
    
    public int getX() {
        return x;
    }
    
    public String incrementVariables() {
        int y = 0;
        x++;
        y++;
        return "x is " + x + " and y is " + y;
    }
}
