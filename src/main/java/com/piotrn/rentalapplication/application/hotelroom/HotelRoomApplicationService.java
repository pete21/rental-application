package com.piotrn.rentalapplication.application.hotelroom;

import com.piotrn.rentalapplication.domain.hotelroom.HotelRoom;
import com.piotrn.rentalapplication.domain.hotelroom.HotelRoomFactory;

import java.util.Map;

public class HotelRoomApplicationService {

//    private final HotelApplicationService hotelApplicationService = new HotelApplicationService();

    public void add(String hotelId, int roomNumber, String description, Map<String, Double> spaces) {

//        HotelRoom hotelRoom = new HotelRoom(roomNumber,description,spaces);
//        hotelApplicationService.addRoom(hotelId, hotelRoom);

        HotelRoom hotelRoom = new HotelRoomFactory().create(hotelId, roomNumber, description, spaces);
    }
}
