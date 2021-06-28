package com.company;
// Create an accountant class
public class Accountant extends Staffs {
// Generate constructor
    public Accountant(String employeeName, String employeeId, int durationOfStay, String qualification, String workRate, String department, boolean markAttendance) {
        super(employeeName, employeeId, durationOfStay, qualification, workRate, department, markAttendance);
    }
// Create methods for the the accountant class
   public void raiseVoucher() {
       System.out.println("Making payments");
   }
   public void paySalary() {
       System.out.println("Yes boss!");
   }
}
