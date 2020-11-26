package com.zeronsoftn.cjm.memo;

import lombok.*;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity(name="memo")
public class Memodel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer createorder;

    @Column
    private String title;

    @Column
    private String description;

    @Builder
    public Memodel(Integer createorder, String title, String description){
        this.createorder=createorder;
        this.title=title;
        this.description=description;
    }
}
