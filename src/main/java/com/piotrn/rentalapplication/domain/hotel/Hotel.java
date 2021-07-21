package com.piotrn.rentalapplication.domain.hotel;

import com.piotrn.rentalapplication.domain.hotelroom.HotelRoom;
import com.piotrn.rentalapplication.domain.apartment.Address;

import java.util.LinkedList;
import java.util.List;

public class Hotel {
    private final String name;
    private final Address address;
    private List<HotelRoom> hotelRooms;

    Hotel(String name, Address address) {
        this.name = name;
        this.address = address;
        hotelRooms = new LinkedList<>();
    }
    public void addRoom(HotelRoom room) {
        hotelRooms.add(room);
    }
}
