package com.twu.biblioteca;



/**
 * Created by Arthur.w on 2016/6/8.
 */
public class User {
    private String name;
    private String email;
    private String phonenumber;
    private String librarynumber;
    private String password;



    public User() {
    }

    public User(String name, String email, String phonenumber, String librarynumber, String password) {
        this.name = name;
        this.email = email;
        this.phonenumber = phonenumber;
        this.librarynumber = librarynumber;
        this.password = password;
    }

    public String getLibrarynumber() {
        return librarynumber;
    }

    public void setLibrarynumber(String librarynumber) {
        this.librarynumber = librarynumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String showUserInformation() {
        return "User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phonenumber=" + phonenumber +
                '}';
    }

}
