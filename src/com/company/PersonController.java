package com.company;


import java.util.HashMap;

public class PersonController {
    HashMap<Integer, Manager> Managers= new HashMap<Integer, Manager>();
    HashMap<Integer, Donor> Donors= new HashMap<Integer, Donor>();
    HashMap<Integer, Volunteer> Volunteers= new HashMap<Integer, Volunteer>();

    public PersonController(){

    }

    public void AddManager(Manager manager) {
        Managers.put(manager.getID(), manager);
    }

    public void AddDonors(Donor donor) {
        Donors.put(donor.getID(), donor);
    }

    public void AddVolunteer(Volunteer volunteer) {
        Volunteers.put(volunteer.getID(), volunteer);
    }

    public void ListManagers(int managerAtIndex){
        System.out.println(Managers.get(managerAtIndex).getFullName());
    }

    public void ListDonors(int donorAtIndex){
        System.out.println(Donors.get(donorAtIndex).getFullName());
    }

    public void ListVolunteers(int volunteerAtIndex){
        System.out.println(Volunteers.get(volunteerAtIndex).getFullName());
    }



}
