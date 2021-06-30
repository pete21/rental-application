package com.piotrn.rentalapplication.domain.apartment;

class Room {
    private final String name;
    private final SquareMeter squareMeter;

    Room(String name, SquareMeter squareMeter) {
        this.name = name;
        this.squareMeter = squareMeter;
    }
    public void test() {
        Room r = new Room("a",new SquareMeter(1.0));
    }
}
