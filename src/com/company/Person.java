package com.company;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;


public abstract class Person implements Serializable{
    private Integer ID = 0;
    private static int personCount = 0;
    private String firstName = "";
    private String middleName = "";
    private String lastName ="";
    private String email = "";
    private final LocalDate creationDate = LocalDate.now();
    private final LocalTime creationTime = LocalTime.now();
    private LocalDate lastModifiedDate;
    private LocalTime lastModifiedTime;
    private Sex sex;

    public Person(){
        this.ID = ++personCount;  // automatically increment ID
    }

    public void setSex(Sex sex){
        this.sex = sex;
        setLastModified();
    }

    public Sex getSex(){
        if (this.sex !=null){
            return this.sex;
        }
        else {
            return Sex.Un_Specified;
        }
    }


    public void setFirstName(String firstName){
        if (!firstName.contentEquals("")){
            this.firstName = firstName;
            setLastModified();
        }
    }


    public void setMiddleName(String middleName){
        if(!middleName.contentEquals("")) {
            this.middleName = middleName;
            setLastModified();
        }
    }


    public void setLastName(String lastName){
        if(!lastName.contentEquals("")) {
            this.lastName = lastName;
            setLastModified();
        }
    }

    private void setLastModified()
    {
        this.lastModifiedDate = LocalDate.now();
        this.lastModifiedTime = LocalTime.now();
    }


    public void setFullName(String firstName, String middleName, String lastName){
        setFirstName(firstName);
        setMiddleName(middleName);
        setLastName(lastName);
    }

    public String getFirstName(){
    if(this.firstName.isEmpty()){
        return " ";
    }
    else{
        return this.firstName;
    }
    }

    public String getMiddleName(){
        if(this.middleName.isEmpty()){
            return " ";
        }
        else
        {
            return this.middleName;
        }
    }

    public String getLastName(){
        if(this.lastName.isEmpty()){
            return " ";
        }
        else return this.lastName;
    }

    public String getFullName() {
        String temp = getFirstName().trim() + " " + getMiddleName().trim() + " " + getLastName().trim();
        temp = temp.trim();
        temp = temp.replaceAll("\\s\\s", " ");
        if (temp.contentEquals("")) {
            return "*** Unknown person ***";
        } else {
            return temp;
        }
    }


    public LocalDate getCreationDate() {
        return creationDate;
    }

    public LocalTime getCreationTime(){
        return creationTime;
    }

    public Integer getID(){
        return this.ID;
    }

}
