package edu.macalester.cs124.students2;

public class Student {
    private Name name;
    private int points, pointsPossible;
    
    public Student(Name name) {
        this.name = name;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getPointsPossible() {
        return pointsPossible;
    }

    public void setPointsPossible(int pointsPossible) {
        this.pointsPossible = pointsPossible;
    }

    public Name getName() {
        return name;
    }
}
