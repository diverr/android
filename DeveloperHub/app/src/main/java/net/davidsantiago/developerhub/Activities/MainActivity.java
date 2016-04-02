package net.davidsantiago.developerhub.Activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.Toast;

import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.SaveCallback;

import net.davidsantiago.developerhub.R;
import net.davidsantiago.developerhub.Util.BaseActivity;


public class MainActivity extends BaseActivity {

    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutResource());

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setLogo(R.mipmap.ic_launcher);

        //ParseObject testObject = new ParseObject("TestObject");
        //testObject.put("foo", "bar");
        //testObject.put("foo2", "bar2");

        //testObject.saveInBackground(new SaveCallback() {
        //    @Override
        //    public void done(ParseException e) {
        //        Toast.makeText(MainActivity.this, "Hola, ya termino", Toast.LENGTH_LONG).show();
        //    }
        //});
    }

    @Override
    protected int getLayoutResource() {
        return R.layout.activity_main;
    }


}
