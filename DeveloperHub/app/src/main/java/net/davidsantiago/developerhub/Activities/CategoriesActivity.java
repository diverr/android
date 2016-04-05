package net.davidsantiago.developerhub.Activities;

import android.os.Bundle;
import android.support.v7.internal.widget.AdapterViewCompat;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import net.davidsantiago.developerhub.API.Api;
import net.davidsantiago.developerhub.Adapters.CustomCategoryAdapter;
import net.davidsantiago.developerhub.Models.Category;
import net.davidsantiago.developerhub.R;
import net.davidsantiago.developerhub.Util.BaseActivity;

import java.util.LinkedList;
import java.util.List;


public class CategoriesActivity extends BaseActivity implements AdapterViewCompat.OnItemClickListener {

    private Toolbar toolbar;
    private ListView listView;
    private CustomCategoryAdapter adapter;

    private List<Category> listCategories;

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
        listView.setOnItemClickListener((AdapterView.OnItemClickListener) this);

        listCategories = new LinkedList<Category>();
        listCategories = Api.getAllCategories();

    }

    @Override
    protected int getLayoutResource() {
        return R.layout.activity_category;
    }


    @Override
    public void onItemClick(AdapterViewCompat<?> parent, View view, int position, long id) {
        Toast.makeText(this, "Click en: " + listCategories.get(position).getName(), Toast.LENGTH_LONG).show();
    }
}
