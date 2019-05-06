package edu.xavier.csci.flowerpower.Reservation;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ReservationRepository extends CrudRepository<Reservation, Integer> {

    @Query(value = "SELECT * FROM Reservation r  WHERE r.approved = false", nativeQuery = true)
    List<Reservation> findPending(@Param("approved") boolean approved);

    @Query(value = "SELECT * FROM Reservation r  WHERE r.approved = true", nativeQuery = true)
    List<Reservation> findApproved(@Param("approved") boolean approved);
}