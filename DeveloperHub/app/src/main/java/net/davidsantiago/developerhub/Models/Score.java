package net.davidsantiago.developerhub.Models;

import com.parse.ParseClassName;
import com.parse.ParseObject;

/**
 * Created by davidsantiago on 2/4/16.
 */
@ParseClassName("Score")
public class Score extends ParseObject {

    private String id;
    private User owner;
    private Course course;
    private float score;

    public String getId() {
        return getObjectId();
    }

    public User getOwner() {
        return (User) getParseObject("owner");
    }

    public void setOwner(User owner) {
        put("owner", owner);
    }

    public Course getCourse() {
        return (Course) getParseObject("course");
    }

    public void setCourse(Course course) {
        put("course", course);
    }

    public float getScore() {
        return (float) getDouble("score");
    }

    public void setScore(float score) {
        put("score", score);
    }
}
