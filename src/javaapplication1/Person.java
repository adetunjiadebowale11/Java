/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Adebowale
 */
class Person {
    
     private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    
    
    public Person(){
        
    }

    /**
     * @return the firstName
     */
    protected String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    protected void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    protected String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    protected void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the email
     */
    protected String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    protected void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the phoneNumber
     */
    protected String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * @param phoneNumber the phoneNumber to set
     */
    protected void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    
    
}
