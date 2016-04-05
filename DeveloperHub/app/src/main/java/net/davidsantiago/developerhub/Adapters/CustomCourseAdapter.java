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

import net.davidsantiago.developerhub.API.Api;
import net.davidsantiago.developerhub.Models.Course;
import net.davidsantiago.developerhub.R;

/**
 * Created by davidsantiago on 2/4/16.
 */
public class CustomCourseAdapter extends ParseQueryAdapter<Course> {

    public CustomCourseAdapter(Context context) {
        super(context, new QueryFactory<Course>() {

            @Override
            public ParseQuery<Course> create() {
                ParseQuery<Course> query = ParseQuery.getQuery(Course.class);
                return query;
            }
        });

    }

    @Override
    public View getItemView(Course course, View convertView, ViewGroup parent) {

        ViewHolder viewHolder;

        if(convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.custom_adapter_courses, null);

            viewHolder = new ViewHolder();
            viewHolder.textViewTitle = (TextView) convertView.findViewById(R.id.textViewCourseTitle);
            viewHolder.imgView = (ParseImageView) convertView.findViewById(R.id.imageViewPhotoCourse);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        viewHolder.textViewTitle.setText(course.getTitle());
        Api.getDetailsForCourse(getContext(), course.getOwner().getObjectId(), course.getObjectId(), viewHolder.textViewDetails);
        ParseFile file = course.getIcon();
        if(file != null) {
            Picasso.with(getContext()).load(file.getUrl()).into(viewHolder.imgView);
        }

        return convertView;
    }

    class ViewHolder {
        TextView textViewTitle;
        TextView textViewDetails;
        ParseImageView imgView;
    }
}
