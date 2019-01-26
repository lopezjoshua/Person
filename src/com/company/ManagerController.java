package com.company;


import java.util.HashMap;

public class ManagerController {
    HashMap<Integer, Manager> Managers= new HashMap<Integer, Manager>();

    public ManagerController(){

    }

    public void AddManager(Manager manager) {
        Managers.put(manager.getID(), manager);
    }

    public void ListManagers(int managerAtIndex){
        System.out.println(Managers.get(managerAtIndex).getFullName());
    }



}
