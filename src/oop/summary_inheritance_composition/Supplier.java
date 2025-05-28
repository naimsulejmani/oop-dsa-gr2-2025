package oop.summary_inheritance_composition;

import java.util.ArrayList;

public class Supplier {
    private int id;
    private String companyName;
    private String address;
    private String email;
    private String phoneNumber;
    private String contactPerson;

    private ArrayList<Product> products = new ArrayList<>();

    public Supplier() {
    }

    public Supplier(int id, String companyName, String address, String email, String phoneNumber, String contactPerson) {
        this.id = id;
        this.companyName = companyName;
        this.address = address;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.contactPerson = contactPerson;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
    }
}
