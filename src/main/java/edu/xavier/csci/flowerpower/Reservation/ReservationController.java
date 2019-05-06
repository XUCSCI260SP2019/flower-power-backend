package edu.xavier.csci.flowerpower.Reservation;

import edu.xavier.csci.flowerpower.Reservation.Reservation;
import edu.xavier.csci.flowerpower.Reservation.ReservationRepository;
import edu.xavier.csci.flowerpower.Reservation.ReservationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class ReservationController {
    private static final Logger logger = LoggerFactory.getLogger(ReservationController.class);

    @Autowired
    ReservationService ReservationService;
    ReservationRepository ReservationRepository;

    @GetMapping("/reservation")
    private List<Reservation> getAllReservations() {
        return ReservationService.getAllReservations();
    }



    @GetMapping("/reservation/{id}")
    private Reservation getReservation(@PathVariable("id") int id) {
        return ReservationService.getReservationById(id);
    }

    @GetMapping("/pending")
    private List<Reservation> getPendingReservation(){
        return ReservationService.getPendingReservations();
    }

    @GetMapping("/approved")
    private List<Reservation> getApprovedReservation(){
        return ReservationService.getApprovedReservations();
    }

    @DeleteMapping("/reservation/{id}")
    private void deleteReservation(@PathVariable("id") int id) {
        ReservationService.delete(id);
    }

    @PostMapping("/reservation")
    private long saveReservation(@RequestBody Reservation reservation) {
        ReservationService.saveOrUpdate(reservation);
        return reservation.getId();
    }

}
