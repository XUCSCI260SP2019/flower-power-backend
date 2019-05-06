package edu.xavier.csci.flowerpower.Reservation;

import edu.xavier.csci.flowerpower.Reservation.Reservation;
import edu.xavier.csci.flowerpower.Reservation.ReservationRepository;
import edu.xavier.csci.flowerpower.Reservation.ReservationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
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

    @GetMapping("/pending/{id}")
    private List<Reservation> getPendingByID(@PathVariable("id") int id){
        List<Reservation> Final = new ArrayList<>();
        List<Reservation> list = getPendingReservation();
        for(int i = 0; i < list.size() ; i++){
            if(list.get(i).professorid == id){
                Final.add(list.get(i));
            }
        }
        return(Final);
    }

    @GetMapping("/approved")
    private List<Reservation> getApprovedReservation(){
        return ReservationService.getApprovedReservations();
    }

    @GetMapping("/approved/{id}")
    private List<Reservation> getApprovedByID(@PathVariable("id") int id){
        List<Reservation> Final = new ArrayList<>();
        List<Reservation> list = getApprovedReservation();
        for(int i = 0; i < list.size() ; i++){
            if(list.get(i).professorid == id){
                Final.add(list.get(i));
            }
        }
        return(Final);
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

    @PostMapping("/reservation/{id}/{start}/{end}/{name}")
    private void newReservation(@PathVariable("id") int id, @PathVariable("start") String start,
                                @PathVariable("end") String end, @PathVariable("name") String name){
        Reservation Res = new Reservation(name, id, false, start, end, false, "");
        ReservationService.saveOrUpdate(Res);
    }

}
