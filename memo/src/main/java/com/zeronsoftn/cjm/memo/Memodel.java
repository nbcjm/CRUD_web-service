package com.zeronsoftn.cjm.memo;

import javax.persistence.*;

@Entity(name="memo")
public class Memodel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer createorder;

    @Column
    private String title;

    @Column
    private String description;

    public Memodel(){

    }

    public Memodel(String title, String description){
        this.title=title;
        this.description=description;
    }
}
