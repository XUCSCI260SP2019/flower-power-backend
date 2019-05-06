package edu.xavier.csci.flowerpower.Reservation;

import edu.xavier.csci.flowerpower.Professor.Professor;

import javax.persistence.*;

@Entity
public class Reservation {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY) //To be edited
    @Column(name = "id", updatable = true)
    int id;
    String fullname;
    int professorid;
    boolean approved;
    String starttime;
    String endtime;
    boolean cancelled;
    String cancellationreason;

    public Reservation() {
        fullname = "";
        professorid = 0;
        approved = false;
        starttime = "";
        endtime = "";
        cancelled = false;
        cancellationreason = "";
    }

    public Reservation( String FN, int PID, boolean A, String ST, String ET, boolean C, String CR  ) {
        fullname = FN;
        professorid = PID;
        approved = A;
        starttime = ST;
        endtime = ET;
        cancelled = C;
        cancellationreason = CR;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }
    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public int getProfessorid () {return professorid;}
    public void setProfessorid(int professorid) {
        this.professorid = professorid;
    }

    public boolean getApproved() {
        return approved;
    }
    public void setApproved(boolean approved) {
        this.approved = approved;
    }

    public String getStarttime(){
        return starttime;
    }
    public void setStarttime(String starttime){
        this.starttime = starttime;
    }

    public String getEndtime(){
        return endtime;
    }
    public void setEndtime(String endtime){
        this.endtime = endtime;
    }

    public boolean getCancelled (){
        return cancelled;
    }
    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }

    public String getCancellationreason() {
        return cancellationreason;
    }
    public void setCancellationreason(String cancellationreason) {
        this.cancellationreason = cancellationreason;
    }
}
