package ru.andzhey.usermanager.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "users")
public class User {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "USER_NAME")
    private String userName;

    @Column(name = "USER_AGE")
    private int userAge;

    @Column(name = "isAdmin")
    private boolean admin;

    @Column(name = "createdDate")
    private Date createdDate;

    public boolean isAdmin() {
        return admin;
    }

    public void setIsAdmin(boolean isAdmin) {
        this.admin = isAdmin;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
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

    public int getUserAge() {
        return userAge;
    }

    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", userAge=" + userAge +
                ", admin=" + admin +
                ", createdDate=" + createdDate +
                '}';
    }
}
