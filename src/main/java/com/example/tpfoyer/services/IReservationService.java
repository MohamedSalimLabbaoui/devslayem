package com.example.tpfoyer.services;

import com.example.tpfoyer.entities.Reservation;

import java.util.List;

public interface IReservationService 
{
    Reservation addOrUpdateReservation(Reservation Reservation);
    Reservation getReservation(String id);
    List<Reservation> getAllReservations();
    void deleteReservation(String id);
}
