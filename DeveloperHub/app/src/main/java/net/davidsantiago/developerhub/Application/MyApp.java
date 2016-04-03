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

    private final String APPID = "y3h39K2E7w3NjlIp4tHcBQslM64svj0Zr59V2jNG";
    private final String CLIENTKEY = "0xQIJhRlnYwZrBBWSG0Vt63NS0gRa6tFAVSkCdZK";

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
