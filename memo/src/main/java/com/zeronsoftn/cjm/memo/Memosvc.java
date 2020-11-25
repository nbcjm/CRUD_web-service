package com.zeronsoftn.cjm.memo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class Memosvc {

    @Autowired
    Memorepo memorepo;

    public List<Memodel> findAll(){
        List<Memodel> memolist = new ArrayList<>();
        memorepo.findAll().forEach(e -> memolist.add(e));
        return memolist;
    }

    public Optional<Memodel> findByCreateorder(Integer createorder){
        Optional<Memodel> memo = memorepo.findById(createorder);
        return memo;
    }

    public void deleteByCreateorder(Integer createorder){
        memorepo.deleteById(createorder);
    }

    public Memodel save(Memodel memo){
        memorepo.save(memo);
        return memo;
    }
}
