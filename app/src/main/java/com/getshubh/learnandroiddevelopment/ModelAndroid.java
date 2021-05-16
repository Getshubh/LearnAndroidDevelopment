package com.getshubh.learnandroiddevelopment;

import com.google.firebase.database.IgnoreExtraProperties;

@IgnoreExtraProperties
public class ModelAndroid {

public Topic topic;

    public Topic getTopic() {
        return topic;
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
    }
}
