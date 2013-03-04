package edu.macalester.cs124.students2;

public class Name {
    private String first, middle, last;
    private boolean goesByMiddleName, familyNameFirst;

    public Name(
            String first, String middle, String last,
            boolean goesByMiddleName,
            boolean familyNameFirst) {
        this.first = first;
        this.middle = middle;
        this.last = last;
        this.goesByMiddleName = goesByMiddleName;
        this.familyNameFirst = familyNameFirst; 
    }

    public String getConversationalName() {
        if(goesByMiddleName)
            return middle;
        else
            return first;
    }

    public String getFullName() {
        if(familyNameFirst)
            return last + " " + first + " " + middle;
        else
            return first + " " + middle + " " + last;
    }
}
