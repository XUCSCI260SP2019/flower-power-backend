package edu.xavier.csci.flowerpower.Student;

import javax.persistence.*;

@Entity
public class Student {


    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id", updatable = false)
    int id;
    String email;
    String password;
    String fullname;
    //String[] associated_professors; //not entirely sure how to set this up

    public Student()
    {
        email = "";
        password = "";
        fullname = "";
    }
    public Student(String E, String P, String FN)
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

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) { this.fullname = fullname; }

    public long getId() {return id;}

    public void setId(int id){this.id = id;}
}