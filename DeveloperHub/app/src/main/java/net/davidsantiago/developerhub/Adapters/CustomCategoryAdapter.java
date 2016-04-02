package net.davidsantiago.developerhub.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.parse.ParseQuery;
import com.parse.ParseQueryAdapter;

import net.davidsantiago.developerhub.Models.Category;
import net.davidsantiago.developerhub.R;

/**
 * Created by davidsantiago on 2/4/16.
 */
public class CustomCategoryAdapter extends ParseQueryAdapter<Category> {

    public CustomCategoryAdapter(Context context) {
        super(context, new ParseQueryAdapter.QueryFactory<Category>() {

            @Override
            public ParseQuery<Category> create() {
                ParseQuery<Category> query = ParseQuery.getQuery(Category.class);
                return query;
            }
        });

    }

    @Override
    public View getItemView(Category object, View convertView, ViewGroup parent) {

        if(convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.example, null);
        }

        TextView textView = (TextView) convertView.findViewById(R.id.textViewTitle);

        textView.setText(object.getName());

        return convertView;
    }
}
