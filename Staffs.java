package com.company;

public class Staffs {
    private String employeeName;
    private String employeeId;
    private int durationOfStay;
    private String qualification;
    private String workRate;
    private String department;
    private boolean markAttendance;

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public int getDurationOfStay() {
        return durationOfStay;
    }

    public void setDurationOfStay(int durationOfStay) {
        this.durationOfStay = durationOfStay;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getWorkRate() {
        return workRate;
    }

    public void setWorkRate(String workRate) {
        this.workRate = workRate;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public boolean isMarkAttendance() {
        return markAttendance;
    }

    public void setMarkAttendance(boolean markAttendance) {
        this.markAttendance = markAttendance;
    }

    public Staffs(String employeeName, String employeeId, int durationOfStay, String qualification, String workRate, String department, boolean markAttendance) {
        this.employeeName = employeeName;
        this.employeeId = employeeId;
        this.durationOfStay = durationOfStay;
        this.qualification = qualification;
        this.workRate = workRate;
        this.department = department;
        this.markAttendance = markAttendance;
    }
}
