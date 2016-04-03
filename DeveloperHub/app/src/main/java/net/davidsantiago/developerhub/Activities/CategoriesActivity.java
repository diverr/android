package net.davidsantiago.developerhub.Activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ListView;
import android.widget.Toast;

import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.SaveCallback;

import net.davidsantiago.developerhub.Adapters.CustomCategoryAdapter;
import net.davidsantiago.developerhub.R;
import net.davidsantiago.developerhub.Util.BaseActivity;


public class CategoriesActivity extends BaseActivity {

    private Toolbar toolbar;

    private ListView listView;
    private CustomCategoryAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutResource());

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setLogo(R.mipmap.ic_launcher);

        listView = (ListView) findViewById(R.id.listViewCategory);
        adapter = new CustomCategoryAdapter(this);
        listView.setAdapter(adapter);


    }

    @Override
    protected int getLayoutResource() {
        return R.layout.activity_main;
    }


}
