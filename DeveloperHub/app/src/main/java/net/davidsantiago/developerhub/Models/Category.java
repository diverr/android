package net.davidsantiago.developerhub.Models;

import com.parse.ParseClassName;
import com.parse.ParseFile;
import com.parse.ParseObject;

/**
 * Created by davidsantiago on 2/4/16.
 */
@ParseClassName("Category")
public class Category extends ParseObject {

    private String id;
    private String name;
    private ParseFile icon;
    private String color;

    public String getId() {
        return getObjectId();
    }

    public String getName() {
        return getString("name");
    }

    public ParseFile getIcon() {
        return getParseFile("icon");
    }

    public String getColor() {
        return getString("color");
    }


}
