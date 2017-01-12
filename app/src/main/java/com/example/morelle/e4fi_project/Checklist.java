package com.example.morelle.e4fi_project;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ESTEL on 12/01/2017.
 */

public class Checklist {

    List<String> toDo = new ArrayList<String>();
    List<String> done = new ArrayList<String>();

    public Checklist() {

    }

    public void addThingtoDo(String todo){
        if(!(toDo.contains(todo)))
            toDo.add(todo);
    }

    //Quand l'utilisateur a coche une case
    public void clicked(String s){
        if(toDo.contains(s)) {
            toDo.remove(s);
            done.add(s);
        }
    }

    public void Unclicked(String s){
        if(done.contains(s)) {
            toDo.add(s);
            done.remove(s);
        }
    }

    public void removeToDo(String s){
            if(toDo.contains(s))
                toDo.remove(s);
            if(done.contains(s))
                done.remove(s);
    }

}
