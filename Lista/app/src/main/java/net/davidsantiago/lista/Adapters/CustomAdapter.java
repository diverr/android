package net.davidsantiago.lista.Adapters;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import net.davidsantiago.lista.R;

import java.util.List;

/**
 * Created by davidsantiago on 1/4/16.
 */
public class CustomAdapter extends BaseAdapter {

    private int layoutMolde;
    private List<String> lista;
    private Activity activity;

    public CustomAdapter(Activity activity, List<String> list, int layout) {
        this.activity = activity;
        this.lista = list;
        this.layoutMolde = layout;
    }

    @Override
    public int getCount() {
        return lista.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = activity.getLayoutInflater();
        convertView = inflater.inflate(layoutMolde, null);

        TextView textView = (TextView) convertView.findViewById(R.id.textViewNombre);
        textView.setText(lista.get(position));

        return convertView;
    }

}
