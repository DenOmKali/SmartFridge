package com.spdu.model;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.stereotype.Component;

public enum Category {
    MEAT("м'ясо"),
    FISH("рибі"),
    SOUCE("соуси"),
    GROCERY("бакалія"),
    VEGETABLES("овочі"),
    FRUITS("фрукти"),
    SPICES("спеції"),
    BAKERY("випічка"),
    DAIRY("молочка");

    private final String title;


    Category(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
