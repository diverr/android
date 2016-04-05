package net.davidsantiago.developerhub.API;

import android.content.Context;
import android.widget.TextView;

import com.parse.FindCallback;
import com.parse.Parse;
import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.ParseQuery;
import com.parse.ParseQueryAdapter;

import net.davidsantiago.developerhub.Models.Category;
import net.davidsantiago.developerhub.Models.Course;
import net.davidsantiago.developerhub.Models.User;
import net.davidsantiago.developerhub.Models.Video;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by davidsantiago on 5/4/16.
 */
public class Api {

    // Categories
    public static List<Category> getAllCategories() {

        final List<Category> list = new LinkedList<Category>();

        ParseQuery<Category> query = ParseQuery.getQuery(Category.class);
        query.findInBackground(new FindCallback<Category>() {
            @Override
            public void done(List<Category> categories, ParseException e) {
                if(e == null) {
                    for(int i = 0; i < categories.size(); i++) {
                        list.add(categories.get(i));
                    }
                }
            }
        });

        return list;

    }

    public static void getDetailsForCourse(final Context context, final String idOwner, final String idCourse, final TextView details) {
        final User u = new User();
        ParseQuery<User> q = ParseQuery.getQuery(User.class);
        q.whereEqualTo("objectId", idOwner);
        q.findInBackground(new FindCallback<User>() {
            @Override
            public void done(List<User> users, ParseException e) {
                if(e == null && users.size() == 1) {
                    u.setUserName(users.get(0).getUserName());

                    ParseQuery<Video> query = ParseQuery.getQuery(Video.class);

                    Course courseTemp = (Course) ParseObject.createWithoutData("Course", idCourse);

                    query.whereEqualTo("course", courseTemp);
                    query.findInBackground(new FindCallback<Video>() {
                        @Override
                        public void done(List<Video> videos, ParseException ex) {
                            int videoSize = videos.size();
                            if(ex == null) {
                                if(videoSize == 1) {
                                    details.setText("by " + u.getUserName() + " - " + videoSize + " video");
                                } else {
                                    details.setText("by " + u.getUserName() + " - " + videoSize + " videos");
                                }
                            }
                        }
                    });
                }
            }
        });
    }




}
