package net.davidsantiago.developerhub.API;

import com.parse.FindCallback;
import com.parse.ParseException;
import com.parse.ParseQuery;
import com.parse.ParseQueryAdapter;

import net.davidsantiago.developerhub.Models.Category;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by davidsantiago on 5/4/16.
 */
public class Api {

    // Categories
    public static List<Category> getAllCategories() {

        final List<Category> list = new LinkedList<Category>();

        ParseQuery<Category> query = ParseQuery.getQuery(Category.class);
        query.findInBackground(new FindCallback<Category>() {
            @Override
            public void done(List<Category> categories, ParseException e) {
                if(e == null) {
                    for(int i = 0; i < categories.size(); i++) {
                        list.add(categories.get(i));
                    }
                }
            }
        });

        return list;

    }

}
