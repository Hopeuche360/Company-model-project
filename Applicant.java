package com.company;

public class Applicant {
    private String applicantName;
    private String qualification;
    private int yearsOfExperience;

    public String getApplicantName() {
        return applicantName;
    }

    public void setApplicantName(String applicantName) {
        this.applicantName = applicantName;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public Applicant(String applicantName, String qualification, int yearsOfExperience) {
        this.applicantName = applicantName;
        this.qualification = qualification;
        this.yearsOfExperience = yearsOfExperience;
    }
}

