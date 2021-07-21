package com.piotrn.rentalapplication.application.apartment;

import com.piotrn.rentalapplication.domain.apartment.Apartment;
import com.piotrn.rentalapplication.domain.apartment.ApartmentFactory;
import com.piotrn.rentalapplication.domain.apartment.ApartmentRepository;

import java.util.Map;

public class ApartmentApplicationService {

    private final ApartmentRepository apartmentRepository;

    public ApartmentApplicationService(ApartmentRepository apartmentRepository) {
        this.apartmentRepository = apartmentRepository;
    }

    public void add(String ownerId, String street, String postalCode, String houseNumber, String apartmentNumber, String city, String country, String description, Map<String, Double> roomsDefinition) {

        Apartment apartment = new ApartmentFactory().create(ownerId, street, postalCode, houseNumber, apartmentNumber, city, country, description, roomsDefinition);

        apartmentRepository.save(apartment);
    }
}
