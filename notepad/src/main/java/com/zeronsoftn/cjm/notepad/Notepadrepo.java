package com.zeronsoftn.cjm.notepad;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Notepadrepo extends JpaRepository<Notepad_entitiy, Long> {
    public List<Notepad_entitiy> findByCreatenum(String createnum);

    public List<Notepad_entitiy> findByTitle(String title);

}
