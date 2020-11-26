package com.zeronsoftn.cjm.memo;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class Memodto {
    private Integer createorder;
    private String title;
    private String description;

    public Memodel Pass(){
        Memodel build = Memodel.builder()
                .createorder(createorder)
                .title(title)
                .description(description)
                .build();
        return build;
    }

    @Builder
    public Memodto(Integer createorder, String title, String description){
        this.createorder=createorder;
        this.title=title;
        this.description=description;
    }
}
