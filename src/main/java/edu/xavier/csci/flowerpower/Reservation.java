package edu.xavier.csci.flowerpower;

import edu.xavier.csci.flowerpower.Professor.Professor;

import javax.persistence.*;

@Entity
public class Reservation {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY) //To be edited
    @Column(name = "id", updatable = true)
    int id;
    String time;
    Professor prof;
    Boolean open;



    public Reservation()
    {
        time = "";
        prof = null;
        open = false;


    }

    public Reservation(String T, Professor P, Boolean O) {
        time = T;
        prof = P;
        open = O;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Professor getProf() {
        return prof;
    }

    public void setProf(Professor prof) {
        this.prof = prof;
    }

    public Boolean getOpen() {
        return open;
    }

    public void setOpen(Boolean open) {
        this.open = open;
    }
}
