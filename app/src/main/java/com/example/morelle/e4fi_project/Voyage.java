package com.example.morelle.e4fi_project;

import android.widget.ImageView;

import com.orm.SugarRecord;
import com.orm.dsl.Table;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ESTEL on 12/01/2017.
 */
@Table
public class Voyage  extends SugarRecord
{
    private Long id;
    String titre, date, lieu, description;
    ImageView image;
    Checklist checklist;
    Budget budget;
    List<Billet> billets = new ArrayList<Billet>();

    public Voyage(String titre, String date, String lieu, String description, ImageView image) {
        this.titre = titre;
        this.date = date;
        this.lieu = lieu;
        this.description = description;
        this.image = image;
        this.checklist = new Checklist();
        this.budget = new Budget(0);

    }

    List<Budget> getBooks() {
        return Budget.find(Budget.class, "voyage = ?", this.titre);
    }

    public String getTitre()
    {
            return this.titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getLieu()
    {
        return this.lieu;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ImageView getImage() {
        return image;
    }

    public void setImage(ImageView image) {
        this.image = image;
    }

    public Long getId(){
        return this.id;
    }

    public void addBillet(Billet b)
    {
            billets.add(b);
    }

    public void removeBillets(Billet b)
    {
        billets.remove(b);
    }



}
