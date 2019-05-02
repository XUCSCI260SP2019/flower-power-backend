package edu.xavier.csci.flowerpower.Reservation;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class ReservationService {
    private ReservationRepository ReservationRepository;

    public ReservationService(ReservationRepository ReservationRepository) { this.ReservationRepository = ReservationRepository; }

    public List<Reservation> getAllReservations() {
        List<Reservation> Reservations = new ArrayList<Reservation>();
        ReservationRepository.findAll().forEach(Reservation -> Reservations.add(Reservation));
        return Reservations;
    }

    public Reservation getReservationById(int id) {
        return ReservationRepository.findById(id).get();
    }

    public void saveOrUpdate(Reservation Reservation) {
        ReservationRepository.save(Reservation);
    }

    public void delete(int id) {
        ReservationRepository.deleteById(id);
    }

}