package com.piotrn.rentalapplication.domain.hotelroom;

import com.piotrn.rentalapplication.domain.apartment.SquareMeter;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class HotelRoomFactory {
    public HotelRoom create(String hotelId, int roomNumber, String description, Map<String, Double> spacesDefinition) {
        List<Space> spaces = spacesDefinition
                .entrySet()
                .stream()
                .map(keyValue -> {
                    SquareMeter sq = new SquareMeter(keyValue.getValue());
                    return new Space(keyValue.getKey(),sq);
                })
                .collect(Collectors.toList());
        return new HotelRoom(roomNumber,description,spaces);
    }
}
