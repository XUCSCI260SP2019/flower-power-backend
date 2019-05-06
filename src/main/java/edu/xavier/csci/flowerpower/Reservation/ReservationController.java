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
public class ReservationController {
    private static final Logger logger = LoggerFactory.getLogger(ReservationController.class);

    @Autowired
    ReservationService ReservationService;
    ReservationRepository ReservationRepository;

    @CrossOrigin(origins = "*")
    @GetMapping("/reservation")
    private List<Reservation> getAllReservations() {
        return ReservationService.getAllReservations();
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/reservation/{id}")
    private Reservation getReservation(@PathVariable("id") int id) {
        return ReservationService.getReservationById(id);
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/pending")
    private List<Reservation> getPendingReservation(){
        return ReservationService.getPendingReservations();
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/pending/{id}")
    private List<Reservation> getPendingByID(@PathVariable("id") int id){
        List<Reservation> Final = new ArrayList<>();
        List<Reservation> list = ReservationService.getPendingReservations();
        for(int i = 0; i < list.size() ; i++){
            if(list.get(i).professorid == id){
                Final.add(list.get(i));
            }
        }
        return(Final);
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/approved")
    private List<Reservation> getApprovedReservation(){
        return ReservationService.getApprovedReservations();
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/approved/{id}")
    private List<Reservation> getApprovedByID(@PathVariable("id") int id){
        List<Reservation> Final = new ArrayList<>();
        List<Reservation> list = ReservationService.getApprovedReservations();
        for(int i = 0; i < list.size() ; i++){
            if(list.get(i).professorid == id){
                Final.add(list.get(i));
            }
        }
        return(Final);
    }

    @CrossOrigin(origins = "*")
    @DeleteMapping("/reservation/{id}")
    private void deleteReservation(@PathVariable("id") int id) {
        ReservationService.delete(id);
    }

    @CrossOrigin(origins = "*")
    @PostMapping("/reservation")
    private long saveReservation(@RequestBody Reservation reservation) {
        ReservationService.saveOrUpdate(reservation);
        return reservation.getId();
    }

    @CrossOrigin(origins = "*")
    @PostMapping("/reservation/{id}/{starttime}/{endtime}/{fullname}")
    private void newReservation(@PathVariable("id") int id, @PathVariable("starttime") String start,
                                @PathVariable("endtime") String end, @PathVariable("fullname") String name){
        Reservation Res = new Reservation(name, id, false, start, end, false, "");
        ReservationService.saveOrUpdate(Res);
    }

    /*@PostMapping("/approve/{id}")
    private void approveReservation(@PathVariable("id") int id){
        List<Reservation> res = ReservationService.getPendingReservations();
        for(int i = 0; i < res.size(); i ++){
            if(res.get(i).professorid == id){
                res.get(i).approved = true;
                ReservationService.saveOrUpdate((res.get(i)));
            }
        }
    }

    @PostMapping("/cancel/{reason}")
    private  void cancelReservation(@PathVariable("reason") String Reason, @RequestBody Reservation res){
        res.cancelled = true;
        res.cancellationreason = Reason;
    }*/

}
