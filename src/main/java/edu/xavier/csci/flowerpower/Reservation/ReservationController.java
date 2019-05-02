package edu.xavier.csci.flowerpower.Reservation;

import edu.xavier.csci.flowerpower.Reservation.Reservation;
import edu.xavier.csci.flowerpower.Reservation.ReservationRepository;
import edu.xavier.csci.flowerpower.Reservation.ReservationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
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
        return ReservationService.getAllProfessors();
    }


    @GetMapping("/reservation/{id}")
    private Reservation getProfessor(@PathVariable("id") int id) {
        return ReservationService.getProfessorById(id);
    }

    @DeleteMapping("/reservation/{id}")
    private void deleteReservation(@PathVariable("id") int id) {
        ReservationService.delete(id);
    }

    @PostMapping("/reservation")
    private long saveReservation(@RequestBody Reservation professor) {
        ReservationService.saveOrUpdate(professor);
        return reservato;
    }

}
