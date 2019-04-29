package edu.xavier.csci.flowerpower;

import javax.persistence.*;

@Entity
public class Student {


    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id", updatable = false)
    int id;
    String email;
    String password;
    String full_name;
    String[] associated_professors; //not entirely sure how to set this up

    public Student()
    {
        email = "";
        password = "";
        full_name = "";
    }
    public Student(String E, String P, String FN)
    {
        email = E;
        password = P;
        full_name = FN;
    }
    //getters and setters for all fields (below text)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getpassword() {
        return password;
    }

    public void setPassword(String password) { this.password = password; }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) { this.full_name = full_name; }

    public long getId() {return id;}

    public void setId(int id){this.id = id;}
}