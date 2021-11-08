package com.bridgelabz.userregistration;

/**************************************************************
 * @author Pavani
 *
 * This class represent the user details.
 * like first name, last name, email, phone number and password.
 **************************************************************/

public class UserDetails {
    private String firstName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String toString() {
        return "User-Details : [First-Name = " + firstName + "]";
    }
}
