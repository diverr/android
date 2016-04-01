package net.davidsantiago.lista.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import net.davidsantiago.lista.Adapters.CustomAdapter;
import net.davidsantiago.lista.R;

import java.util.LinkedList;
import java.util.List;

public class ListaActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);

        listView = (ListView) findViewById(R.id.listViewNombres);

        List<String> lista = new LinkedList<String>();
        lista.add("David");
        lista.add("Fernándo");
        lista.add("Federico");
        lista.add("Luis");

        CustomAdapter adapter = new CustomAdapter(this, lista, R.layout.molde_list_view);

        listView.setAdapter(adapter);


    }
}
