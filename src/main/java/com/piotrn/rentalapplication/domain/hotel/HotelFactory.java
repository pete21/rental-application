package com.piotrn.rentalapplication.domain.hotel;

import com.piotrn.rentalapplication.domain.apartment.Address;

public class HotelFactory {
    public Hotel create(String name, String street, String postalCode, String houseNumber, String city, String country) {
        Address address = new Address(street, postalCode, houseNumber, "", city, country);
        return new Hotel(name, address);
    }
}
