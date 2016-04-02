package net.davidsantiago.developerhub.Models;

import com.parse.ParseClassName;
import com.parse.ParseFile;
import com.parse.ParseUser;

/**
 * Created by davidsantiago on 2/4/16.
 */
@ParseClassName("_User")
public class User extends ParseUser {

    private String id;
    private String email;
    private String password;
    private String userName;
    private Boolean emailVerified;
    private ParseFile photo;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Boolean getEmailVerified() {
        return emailVerified;
    }

    public void setEmailVerified(Boolean emailVerified) {
        this.emailVerified = emailVerified;
    }

    public ParseFile getPhoto() {
        return photo;
    }

    public void setPhoto(ParseFile photo) {
        this.photo = photo;
    }
}
