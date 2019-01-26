package com.company;

public class Main {

    public static void main(String[] args) {


        //Now we can just add new Persons of different kinds like this
        Person myManager = new Manager("James", "Michael", "Stallings");
        Person myDonor = new Donor();
        Person myDonor2 = new Donor();
        Person myDonor3 = new Donor();
        Person myVolunteer = new Volunteer();
        Person myVolunteer2 = new Volunteer();
        Person myDonor4 = new Donor("Jerry", "", "");



        // TEST persons who were named in the constructor
        System.out.println(myManager.getFullName() + " has ID " + myManager.getID() + " and was created on " + myManager.getCreationDate() + " at " + myManager.getCreationTime());

        // TEST persons who were only partially named in the constructor
        System.out.println(myDonor4.getFullName() + " has ID " + myDonor4.getID() + " and was created on " + myDonor4.getCreationDate() + " at " + myDonor4.getCreationTime());


        // What if No name at all has been assigned to person?
        System.out.println(myVolunteer.getFullName() + " has ID " + myVolunteer.getID() + " and was created on " + myVolunteer.getCreationDate() + " at " + myVolunteer.getCreationTime());

        // What if Assigned name in a single function
        myDonor.setFullName("Joshua", "", "Guzon");
        System.out.println(myDonor.getFullName() + " has ID " + myDonor.getID() + " and was created on " + myDonor.getCreationDate() + " at " + myDonor.getCreationTime());

        // If we Assigned first name only in one function
        myDonor2.setFirstName("Sandra");
        System.out.println(myDonor2.getFullName() + " has ID " + myDonor2.getID() + " and was created on " + myDonor2.getCreationDate() + " at " + myDonor2.getCreationTime());

        // If we Assigned middle name only in one function
        myDonor3.setMiddleName("Frederick");
        System.out.println(myDonor3.getFullName() + " has ID " + myDonor3.getID() + " and was created on " + myDonor3.getCreationDate() + " at " + myDonor3.getCreationTime());

        // If we Assigned last name only in one function
        myVolunteer2.setLastName("Pascal");
        System.out.println(myVolunteer2.getFullName() + " has ID " + myVolunteer2.getID() + " and was created on " + myVolunteer2.getCreationDate() + " at " + myVolunteer2.getCreationTime());
    }
}
