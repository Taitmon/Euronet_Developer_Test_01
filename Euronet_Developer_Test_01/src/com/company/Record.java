package com.company;

import java.util.ArrayList;

public class Record
{
    private String firstName;
    private String middleName;
    private String lastName;
    private String streetAddress;
    private ArrayList<String> hobbies = new ArrayList<>();

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getMiddleName()
    {
        return middleName;
    }

    public void setMiddleName(String middleName)
    {
        this.middleName = middleName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public String getStreetAddress()
    {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress)
    {
        this.streetAddress = streetAddress;
    }

    public ArrayList<String> getHobbies()
    {
        return hobbies;
    }

    public void setHobbies(String hobbies)
    {
        this.hobbies.add(hobbies);
    }

    public String getHobbyName(int name)
    {
        return hobbies.get(name);
    }
}
