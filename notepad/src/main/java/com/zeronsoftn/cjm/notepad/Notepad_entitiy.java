package com.zeronsoftn.cjm.notepad;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Notepad_entitiy {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String title;

    private String description;

    public Notepad_entitiy() {

    }

    public Notepad_entitiy(String title,String description){
        this.title=title;
        this.description=description;
    }


}
