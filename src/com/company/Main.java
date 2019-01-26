package com.company;

public class Main {

    public static void main(String[] args) {
        PersonController personController = new PersonController();


// ***** Data entry / retrieval tests below this line ****


        // Making and listing sample Managers here
        for (int a = 1; a < 5; a++) {
            Manager myNewManager = new Manager("James", "M.", "Stallings");
            personController.AddManager(myNewManager);
        }

        personController.Managers.forEach((k,v)->System.out.println("Manager ID: "+k+" is "+v.getFullName()));





        //Making and listing sample Donors here
        for (int a = 1; a < 5; a++) {
            Donor myNewDonor = new Donor("James", "M.", "Stallings");
            personController.AddDonors(myNewDonor);
        }

        personController.Donors.forEach((k,v)->System.out.println("Donor ID: "+k+" is "+v.getFullName()+". The record was created on "+v.getCreationDate()+" at "+v.getCreationTime()));







        //Making and listing sample Volunteers here
        for (int a = 1; a < 5; a++) {
            Volunteer myNewVolunteer = new Volunteer("James", "M.", "Stallings");
            personController.AddVolunteer(myNewVolunteer);
        }

        personController.Volunteers.forEach((k,v)->System.out.println("Volunteer ID: "+k+" is "+v.getFullName()));


    }
}
