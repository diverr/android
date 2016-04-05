package net.davidsantiago.developerhub.Activities;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ListView;

import net.davidsantiago.developerhub.Adapters.CustomCategoryAdapter;
import net.davidsantiago.developerhub.Adapters.CustomCourseAdapter;
import net.davidsantiago.developerhub.R;
import net.davidsantiago.developerhub.Util.BaseActivity;

public class CoursesActivity extends BaseActivity {

    private Toolbar toolbar;
    private ListView listView;
    private CustomCourseAdapter adapter;
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

        ListView listView = (ListView) findViewById(R.id.listViewCourses);
        adapter = new CustomCourseAdapter(this);
        listView.setAdapter(adapter);

    }

    @Override
    protected int getLayoutResource() {
        return R.layout.activity_courses;
    }
}
