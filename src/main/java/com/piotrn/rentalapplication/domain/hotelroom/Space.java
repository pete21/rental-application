package com.piotrn.rentalapplication.domain.hotelroom;

import com.piotrn.rentalapplication.domain.apartment.SquareMeter;

public class Space {
    private final String name;
    private final SquareMeter squareMeter;

    public Space(String name, SquareMeter squareMeter) {
        this.name = name;
        this.squareMeter = squareMeter;
    }
}
