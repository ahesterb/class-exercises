package edu.macalester.cs124.students;

import acm.program.ConsoleProgram;

public class AttendanceProgram extends ConsoleProgram {
    public void run() {
        Name name0 = new Name();
        name0.first = "John";
        name0.middle = "Fitzgerald";
        name0.last = "Kennedy";
        Student jfk = new Student();
        jfk.name = name0;

        Name name1 = new Name();
        name1.first = "James";
        name1.middle = "Paul";
        name1.last = "McCartney";
        Student jpm = new Student();
        jpm.name = name1;

        Name name2 = new Name();
        name2.first = "Hayao";
        name2.middle = "";
        name2.last = "Miyazaki";
        Student hm = new Student();
        hm.name = name2;
        
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
        if(readBoolean("Is " + student.name.first + " present (y/n)? ", "y", "n"))
            student.points++;
         student.pointsPossible++;
    }

    private void printFinalGrade(Student student) {
         println(
             student.name.first + " " + student.name.middle + " " + student.name.last + ": "
             + student.points + "/" + student.pointsPossible
             + " = " + (100.0 * student.points / student.pointsPossible));
    }
}
