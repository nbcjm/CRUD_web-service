package com.zeronsoftn.cjm.memo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class MemoController {

    @Autowired
    Memosvc memosvc;

    @RequestMapping("/")
    public String Main(Model model){
        List<Memodel> List= memosvc.findAll();
        model.addAttribute("List",List);
        return "memohome.html";
    }

}
