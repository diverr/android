package net.davidsantiago.developerhub.Models;

import com.parse.ParseClassName;
import com.parse.ParseObject;
import com.parse.ParseUser;

/**
 * Created by davidsantiago on 2/4/16.
 */
@ParseClassName("Comment")
public class Comment extends ParseObject {

    private String id;
    private String content;
    private Course course;
    private ParseUser owner;

    public String getId(){
        return getObjectId();
    }

    public String getContent() {
        return getString("content");
    }

    public void setContent(String content) {
        put("content", content);
    }

    public Course getCourse() {
        return (Course) getParseObject("course");
    }

    public void setCourse(Course course) {
        put("course", course);
    }

    public ParseUser getOwner() {
        return (User) getParseObject("owner");
    }

    public void setOwner(ParseUser owner) {
        put("owner", owner);
    }
}
