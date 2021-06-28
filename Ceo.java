package com.company;

public class Ceo {
    private String name;
    private String title;

    public Ceo(String name, String title) {
        this.name = name;
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    static void hire(Applicant applicant) {
        if ((applicant.getQualification().equalsIgnoreCase("BSc")) && (applicant.getYearsOfExperience() >= 2)) {
            System.out.println(applicant.getApplicantName() + " is Hired");
    } else {
            System.out.println(applicant.getApplicantName() + " did not meet the minimum requirement");
        }
}
    static void fire(Staffs staff) {
        if (staff.getWorkRate().equalsIgnoreCase("Low")) {
            System.out.println(staff.getEmployeeName() + ", You are fired");
        } else if (staff.getWorkRate().equalsIgnoreCase("Average")) {
            System.out.println(staff.getEmployeeName() + ", You can do better");
        } else if (staff.getWorkRate().equalsIgnoreCase("High")) {
            System.out.println(staff.getEmployeeName() + " Keep it up");
        } else {
            System.out.println("Invalid input");
        }
}
    static void giveRaise(Staffs staff) {
        if (staff.getWorkRate().equalsIgnoreCase("High")) {
            System.out.println("Please give " + staff.getEmployeeName() + " a raise of 10%");
        } else if (staff.getWorkRate().equalsIgnoreCase("Average")) {
            System.out.println("Maintain salary");
        } else if (staff.getWorkRate().equalsIgnoreCase("low")){
            System.out.println("please deduct 2% from " + staff.getEmployeeName() + " remuneration for the month");
        }
        else{
            System.out.println("Invalid input");
        }
}
}
