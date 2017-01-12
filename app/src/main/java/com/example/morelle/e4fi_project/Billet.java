package com.example.morelle.e4fi_project;

import com.orm.SugarRecord;
import com.orm.dsl.Table;

/**
 * Created by ESTEL on 12/01/2017.
 */
@Table
public class Billet extends SugarRecord {
    String title, description;
    private Long id;
    Voyage voyage;

    public Billet(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getId() {
        return id;
    }
}
