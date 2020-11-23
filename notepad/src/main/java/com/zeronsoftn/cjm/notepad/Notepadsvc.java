package com.zeronsoftn.cjm.notepad;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Notepadsvc {
    @Autowired
    private Notepadrepo notepadrepo;

}
