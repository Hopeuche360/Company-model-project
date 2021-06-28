package com.company;

import java.util.ArrayList;

//
public class Company {
    private String companyName;
    private String companyAddress;
    private Ceo ceo;
    private ArrayList<Staffs> staff;
    private Applicant applicant;

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }

    public Ceo getCeo() {
        return ceo;
    }

    public void setCeo(Ceo ceo) {
        this.ceo = ceo;
    }

    public Applicant getApplicant() {
        return applicant;
    }

    public void setApplicant(Applicant applicant) {
        this.applicant = applicant;
    }

    public ArrayList<Staffs> getStaff() {
        return staff;
    }

    public void setStaff(ArrayList<Staffs> staff) {
        this.staff = staff;
    }

    public Company(String companyName, String companyAddress, Ceo ceo, ArrayList<Staffs> staff, Applicant applicant) {
        this.companyName = companyName;
        this.companyAddress = companyAddress;
        this.ceo = ceo;
        this.staff = staff;
        this.applicant = applicant;
    }
}
