package net.davidsantiago.developerhub.Application;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

import net.davidsantiago.developerhub.Models.Category;


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

        Parse.enableLocalDatastore(this);
        Parse.initialize(this, APPID, CLIENTKEY);


    }
}
