package com.zeronsoftn.cjm.notepad;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class NotepadController {

    @Autowired
    Notepadrepo notepadrepo;

    @RequestMapping("/")
    @ResponseBody
    public String list(Model model){
        model.addAttribute("notepad","abc");
        return "Notepadmain";
    }

}
