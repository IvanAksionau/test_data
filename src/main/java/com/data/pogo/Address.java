package com.data.pogo;

public class Address {

    private String city;
    private String street;
    private int building;

    public Address() {
    }

    public Address(String city, String street, int building) {
        this.city = city;
        this.street = street;
        this.building = building;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public int getBuilding() {
        return building;
    }
}
