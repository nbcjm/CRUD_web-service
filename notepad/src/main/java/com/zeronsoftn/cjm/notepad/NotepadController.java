package com.zeronsoftn.cjm.notepad;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class NotepadController {

    @Autowired
    Notepadrepo notepadrepo;

    @GetMapping("/")
    public String list(){
        return "thymeleafNotepadmain.html";
    }

}
