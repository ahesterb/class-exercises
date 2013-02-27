package edu.macalester.cs124.students2;

public class Name {
    private String first, middle, last;

    public Name(String first, String middle, String last) {
        this.first = first;
        this.middle = middle;
        this.last = last;
    }

    public String getConversationalName() {
        return first;
    }

    public String getFullName() {
        return first + " " + middle + " " + last;
    }
}
