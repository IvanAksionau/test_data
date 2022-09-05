package com.data.pogo;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return building == address.building && city.equals(address.city) && street.equals(address.street);
    }
}
