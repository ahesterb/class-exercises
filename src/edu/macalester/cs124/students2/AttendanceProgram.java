package edu.macalester.cs124.students2;

import acm.program.ConsoleProgram;

public class AttendanceProgram extends ConsoleProgram {
    public void run() {
        Student jfk = new Student(new Name("John", "Fitzgerald", "Kennedy"));
        Student jpm = new Student(new Name("James", "Paul", "McCartney"));
        Student hm  = new Student(new Name("Hayao", "", "Miyazaki"));
        
        for(int n = 0; n < 3; n++) {
            println("Day " + n);
            takeAttendance(jfk);
            takeAttendance(jpm);
            takeAttendance(hm);
            println();
        }
        
        println("Final grades:");
        printFinalGrade(jfk);
        printFinalGrade(jpm);
        printFinalGrade(hm);
    }

    private void takeAttendance(Student student) {
        if(readBoolean("Is " + student.getName().getConversationalName() + " present (y/n)? ", "y", "n"))
            student.setPoints(student.getPoints() + 1);
        student.setPointsPossible(student.getPointsPossible() + 1);
    }

    private void printFinalGrade(Student student) {
         println(
             student.getName().getFullName() + ": "
             + student.getPoints() + "/" + student.getPointsPossible()
             + " = " + (100.0 * student.getPoints() / student.getPointsPossible()));
    }
}
