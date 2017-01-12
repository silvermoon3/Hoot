package com.example.morelle.e4fi_project;

import com.orm.SugarRecord;

/**
 * Created by ESTEL on 12/01/2017.
 */

public class Budget extends SugarRecord{

    float somme;


    public Budget(float somme){
        this.somme = somme;
    }

    public float getSomme(){
        return this.somme;
    }

    public void setSomme(float newSomme){
        this.somme = newSomme;
    }

    public void AjouterArgent(float argent){
        this.somme += argent;
    }

    public void DepenserArgent(float argent){
        this.somme -= argent;
    }


}
