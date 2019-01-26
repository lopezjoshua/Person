package com.company;

public class Main {

    public static void main(String[] args) {


        ManagerController myManagerController = new ManagerController();

        for (int a = 1; a < 5; a++) {
            Manager myNewManager = new Manager("James", "M.", "Stallings");
            myManagerController.AddManager(myNewManager);
        }

        myManagerController.Managers.forEach((k,v)->System.out.println("Manager ID: "+k+" is "+v.getFullName()));

    }
}
