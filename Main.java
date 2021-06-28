package com.company;


public class Main {

    public static void main(String[] args) {
        Ceo chikaNwobi = new Ceo("Chika Nwobi", "Managing Director");
//      Company company = new Company("Comenergy Managed Service", "5, Adewale Crescent, Surulere, Lagos", chikaNwobi, staff1, applicant1);
        Applicant applicant1 = new Applicant("Botori Tamuno", "BSc", 3);
//        Applicant applicant2 = new Applicant("Bori Iyage", "BSc", 3);
//        Ceo.hire(applicant1);
        Ceo.hire(applicant1);
        Applicant applicant2 = new Applicant("Jalonge Bastura", "HND", 4);
        Ceo.hire(applicant2);
        Staffs staff1 = new Staffs("Kambili Nkem", "CMS/ATC/NOC/0121", 2, "Bsc", "High", "NOC", true);
        Ceo.fire(staff1);
        Ceo.giveRaise(staff1);
        Staffs staff2 = new Staffs("Jahs Madu", "CMS/IHS/NOC/0011", 5, "HND", "Average", "NOC", true);
        Ceo.fire(staff2);
        Ceo.giveRaise(staff2);
        Staffs staff3 = new Staffs("Fasunlami Buratai", "CMS/ATC/PM/0111", 2, "Bsc", "Low", "Project Management", false);
        Ceo.fire(staff3);
        Ceo.giveRaise(staff3);
    }
}
