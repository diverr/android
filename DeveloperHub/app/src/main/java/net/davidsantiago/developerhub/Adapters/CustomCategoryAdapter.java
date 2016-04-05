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

        ViewHolder viewHolder;

        if(convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.custom_adapter_category, null);

            viewHolder = new ViewHolder();
            viewHolder.textViewTitle = (TextView) convertView.findViewById(R.id.textViewCategoryTitle);
            viewHolder.imgView = (ParseImageView) convertView.findViewById(R.id.imageViewPhotoCategory);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        viewHolder.textViewTitle.setText(category.getName());

        ParseFile file = category.getIcon();
        if(file != null) {
            Picasso.with(getContext()).load(file.getUrl()).into(viewHolder.imgView);
        }

        return convertView;
    }

    class ViewHolder {
        TextView textViewTitle;
        ParseImageView imgView;
    }
}
