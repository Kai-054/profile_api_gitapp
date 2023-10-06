package com.example.profile_user.data.model;

import java.util.ArrayList;

public class userprofile {
    private ArrayList<profile> items;

    public userprofile(ArrayList<profile> items) {
        this.items = items;
    }

    public ArrayList<profile> getItems() {
        return items;
    }

    public void setItems(ArrayList<profile> items) {
        this.items = items;
    }
}
