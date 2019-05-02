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

    public Professor()
    {
        email = "";
        password = "";
        fullname = "";
    }
    public Professor(String E, String P, String FN)
    {
        email = E;
        password = P;
        fullname = FN;
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
}