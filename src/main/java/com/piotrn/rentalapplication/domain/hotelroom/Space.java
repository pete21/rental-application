package com.piotrn.rentalapplication.domain.hotelroom;

import com.piotrn.rentalapplication.domain.apartment.SquareMeter;

class Space {
    private final String name;
    private final SquareMeter squareMeter;

    Space(String name, SquareMeter squareMeter) {
        this.name = name;
        this.squareMeter = squareMeter;
    }
}
