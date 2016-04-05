package net.davidsantiago.developerhub.Application;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

import net.davidsantiago.developerhub.Models.Category;
import net.davidsantiago.developerhub.Models.Comment;
import net.davidsantiago.developerhub.Models.Course;
import net.davidsantiago.developerhub.Models.Score;
import net.davidsantiago.developerhub.Models.User;
import net.davidsantiago.developerhub.Models.Video;


/**
 * Created by davidsantiago on 1/4/16.
 */
public class MyApp extends Application {

    private final String APPID = "R1vKrgmP1SCg0qTf0t9KcR9X9zWFXSTrgllAanWV";
    private final String CLIENTKEY = "f8LCl8axja9uOshMGzdTLWQwhIKVz48sai9SELPs";

    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Category.class);
        ParseObject.registerSubclass(Comment.class);
        ParseObject.registerSubclass(Course.class);
        ParseObject.registerSubclass(Score.class);
        ParseObject.registerSubclass(User.class);
        ParseObject.registerSubclass(Video.class);

        Parse.enableLocalDatastore(this);
        Parse.initialize(this, APPID, CLIENTKEY);



    }
}
