package com.company;
// Create Cleaner class
public class Cleaner extends Staffs {
//    Generate constructor for the Staff fields
    public Cleaner(String employeeName, String employeeId, int durationOfStay, String qualification, String workRate, String department, boolean markAttendance) {
        super(employeeName, employeeId, durationOfStay, qualification, workRate, department, markAttendance);
    }
//    create a method instructing the cleaner's job description
    public void toClean() {
//     print to the console
        System.out.println("Ensure the office and its environs is tidy and kept clean at all times");
    }
}
