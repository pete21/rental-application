package com.piotrn.rentalapplication.domain.hotelroom;

import java.util.List;

public class HotelRoom {
    private final String hotelName;
    private final int roomNumber;
    private String description;
    private final List<Space> spaces;

    HotelRoom(String hotelName, int roomNumber, String description, List<Space> spaces) {
        this.hotelName = hotelName;
        this.roomNumber = roomNumber;
        this.description = description;
        this.spaces = spaces;
    }

    public void setDescription(String description) {
        this.description=description;
    }
}
