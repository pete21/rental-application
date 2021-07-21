package com.piotrn.rentalapplication.application.hotel;

import com.piotrn.rentalapplication.domain.hotel.Hotel;
import com.piotrn.rentalapplication.domain.hotel.HotelFactory;
import com.piotrn.rentalapplication.domain.hotelroom.HotelRoom;

import java.util.HashMap;
import java.util.Map;

public class HotelApplicationService {

    private Map<String, Hotel> hotels = new HashMap<>();

    public Hotel create(String name, String street, String postalCode, String houseNumber, String city, String country) {
        Hotel hotel = new HotelFactory().create(name, street, postalCode, houseNumber, city, country);
        hotels.put(name,hotel);
        return hotel;
    }

    void addRoom(String name, HotelRoom hotelRoom) {
        Hotel hotel = getHotel(name);
        hotel.addRoom(hotelRoom);
    }

    public Hotel getHotel(String name) {
        return hotels.getOrDefault(name,null);
    }

}
