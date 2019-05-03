package edu.xavier.csci.flowerpower.Professor;

import javax.persistence.*;

@Entity
public class Professor {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id", updatable = false)
    int id;
    String email;
    String password;
    String fullname;
    String officebuilding;
    int officeroom;
    String officehourstart;
    String officehourend;


    public Professor()
    {
        email = "";
        password = "";
        fullname = "";
        officebuilding = "";
        officeroom = 0;
        officehourstart = "";
        officehourend = "";
    }
    public Professor(String E, String P, String FN, String OB, int R, String OHS, String OHE)
    {
        email = E;
        password = P;
        fullname = FN;
        officebuilding = OB;
        officeroom = R;
        officehourstart = OHS;
        officehourend = OHE;
    }
    //getters and setters for all fields (below text)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) { this.password = password; }

    public String getFullName() {
        return fullname;
    }

    public void setFullName(String fullname) { this.fullname = fullname; }

    public long getId() {return id;}

    public void setId(int id){this.id = id;}

    public String getOfficeBuilding(){return officebuilding;}

    public void setOfficeBuilding(String officebuilding){ this.officebuilding = officebuilding;}

    public int getOfficeRoom(){return officeroom;}

    public void setOfficeRoom(int officeroom){ this.officeroom = officeroom;}

    public String getOfficeHourStart(){return officehourstart;}

    public void setOfficeHourStart(String officehourstart){ this.officehourstart = officehourstart;}

    public String getOfficeHourEnd(){return officehourend;}

    public void setOfficeHourEnd(String officehourend){ this.officehourend = officehourend;}
}