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
        return getObjectId();
    }

    public String getEmail() {
        return getString("email");
    }

    public void setEmail(String email) {
        put("email", email);
        put("username", email);
    }

    public String getUserName() {
        return getString("name");
    }

    public void setUserName(String userName) {
        put("name", userName);
    }

    public Boolean getEmailVerified() {
        return getBoolean("email");
    }

    public boolean isEmailVerified() {
        return getBoolean("emailVerified");
    }

    public void setEmailVerified(boolean emailVerified) {
        put("emailVerified", emailVerified);
    }

    public ParseFile getPhoto() {
        return getParseFile("photo");
    }

    public void setPhoto(ParseFile photo) {
        put("photo", photo);
    }
}
