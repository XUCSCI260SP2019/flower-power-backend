package edu.xavier.csci.flowerpower;

import javax.persistence.*;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id", updatable = false)
    int id;
    String username;
    String password;
    String firstname;
    String lastname;
    String email;
    Boolean admin;


    public User()
    {
        username= "";
        password = "";
        firstname = "";
        lastname = "";
        email = "";
        admin = false;
    }

    public User(String U, String P, String FN, String LN, String E)
    {
        username = U;
        password = P;
        firstname = FN;
        lastname = LN;
        email = E;
        admin = false;
    }

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstname() {
        return firstname;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public long getId() {
        return id;
    }
    public void setId(int id){
        this.id = id;
    }

    public boolean getAdmin(){return admin;}
    public void setAdmin(){this.admin = admin;}

}
