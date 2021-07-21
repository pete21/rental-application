package com.piotrn.rentalapplication.domain.hotelroom;

import java.util.List;

public class HotelRoom {
    private final int roomNumber;
    private String description;
    private final List<Space> spaces;

    HotelRoom(int roomNumber, String description, List<Space> spaces) {
        this.roomNumber = roomNumber;
        this.description = description;
        this.spaces = spaces;
    }

    public void setDescription(String description) {
        this.description=description;
    }
}
