package com.zeronsoftn.cjm.memo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class MemoController {

    @Autowired
    Memosvc memosvc;

    @RequestMapping("/")
    public String Main(Model model){
        List<Memodto> MemodtoList = memosvc.LoadList();
        model.addAttribute("List",MemodtoList);
        return "memohome.html";
    }

    @GetMapping("/printing/{createorder}")
    public String Printing(@PathVariable("createorder") Integer createorder, Model model){
        Memodto Memo = memosvc.LoadMemo(createorder);
        model.addAttribute("Memo",Memo);
        return "printing.html";
    }

    @DeleteMapping("/printing/{createorder}")
    public String Delete(@PathVariable("createorder") Integer createorder){
        memosvc.deleteByCreateorder(createorder);
        return "redirect:/";
    }

    @GetMapping("/posting")
    public String Posting(Model model){
        return "posting.html";
    }

    @PostMapping("/posting")
    public String Posting(Memodto memodto){
        Integer createorder=memosvc.save(memodto);
        return "redirect:/printing/"+createorder;
    }

    @GetMapping("/printing/rewriting/{createorder}")
    public String Rewriting(@PathVariable("createorder") Integer createorder, Model model){
        Memodto Memo = memosvc.LoadMemo(createorder);
        model.addAttribute("Memo", Memo);
        return "rewriting.html";
    }

    @PutMapping("/printing/rewriting/{createorder}")
    public String Rewriting(Memodto memodto){
        Integer createorder = memosvc.save(memodto);
        return "redirect:/printing/"+createorder;
    }
}
