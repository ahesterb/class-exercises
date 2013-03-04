package edu.macalester.cs124.oopexperiments;

public class FunkyCounter {
    private int x;
    private static int y;
    
    public int getX() {
        return x;
    }
    
    public int getY() {
        return y;
    }
    
    public void incrementVariables() {
        x++;
        y++;
    }
}
