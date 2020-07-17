package com.eujoh.studentapp.HelperClasses.HomeAdapter;

import android.widget.TextView;

public class UpcomingEventsHelperClass {
    int image;
    String title, description;

    public UpcomingEventsHelperClass(int image, String title, String description) {
        this.image = image;
        this.title = title;
        this.description = description;
    }

    public int getImage() {
        return image;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
