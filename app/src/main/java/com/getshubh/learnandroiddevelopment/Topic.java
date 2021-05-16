package com.getshubh.learnandroiddevelopment;

import com.google.firebase.database.IgnoreExtraProperties;

import java.util.ArrayList;

@IgnoreExtraProperties
public class Topic {
    public Topic() {
    }

    public ArrayList<Component> component;


    public ArrayList<Component> getComponent() {
        return component;
    }

    public void setComponent(ArrayList<Component> component) {
        this.component = component;
    }
}