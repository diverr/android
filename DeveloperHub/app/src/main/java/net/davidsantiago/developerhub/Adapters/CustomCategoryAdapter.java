package net.davidsantiago.developerhub.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.parse.ParseFile;
import com.parse.ParseImageView;
import com.parse.ParseQuery;
import com.parse.ParseQueryAdapter;
import com.squareup.picasso.Picasso;

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
    public View getItemView(Category category, View convertView, ViewGroup parent) {

        if(convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.example, null);
        }

        TextView textView = (TextView) convertView.findViewById(R.id.textViewTitle);

        ParseImageView img = (ParseImageView) convertView.findViewById(R.id.imageViewPhotoCategory);

        textView.setText(category.getName());

        ParseFile file = category.getIcon();
        if(file != null) {
            Picasso.with(getContext()).load(file.getUrl()).into(img);
        }

        return convertView;
    }
}
