package net.davidsantiago.developerhub.Activities;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import net.davidsantiago.developerhub.R;
import net.davidsantiago.developerhub.Util.BaseActivity;

public class CoursesActivity extends BaseActivity {

    private Toolbar toolbar;
    private String idCategory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutResource());

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setLogo(R.mipmap.ic_launcher);

        Bundle bundle = getIntent().getExtras();
        idCategory = bundle.getString("objectId");

    }

    @Override
    protected int getLayoutResource() {
        return R.layout.activity_courses;
    }
}
