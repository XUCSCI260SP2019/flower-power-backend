package edu.xavier.csci.flowerpower;

public class user {

    String username;
    String password;
    String firstname;
    String lastname;
    String email;


    public user()
    {
        username= "";
        password = "";
        firstname = "";
        lastname = "";
        email = "";
    }
    public user(String U, String P, String FN, String LN, String E)
    {
        username = U;
        password = P;
        firstname = FN;
        lastname = LN;
        email = E;
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

}
