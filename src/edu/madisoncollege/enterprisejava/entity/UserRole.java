package edu.madisoncollege.enterprisejava.entity;

/**
 * @author paulawaite
 * @version 1.0 10/21/15.
 */
public class UserRole {


    private String userName;
    private String userRole;
    private int id;

    public UserRole() {
    }

    public UserRole(int id, String userName, String userRole) {
        this.userName = userName;
        this.userRole = userRole;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

    public String toString() {
        return System.lineSeparator() +
                "User and Role: " + " "
                + userName + " "
                + userRole ;
    }
}
