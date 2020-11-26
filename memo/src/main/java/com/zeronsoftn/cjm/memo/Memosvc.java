package com.zeronsoftn.cjm.memo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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

    @Transactional
    public Integer save(Memodto memodto){
        return memorepo.save(memodto.Pass()).getCreateorder();
    }

    @Transactional
    public List<Memodto> LoadList(){
        List<Memodel> MemoList = memorepo.findAll();
        List<Memodto> MemodtoList = new ArrayList<>();

        for (Memodel memodel : MemoList){
            Memodto memodto = Memodto.builder()
                    .createorder(memodel.getCreateorder())
                    .title(memodel.getTitle())
                    .description(memodel.getDescription())
                    .build();
            MemodtoList.add(memodto);
        }
        return MemodtoList;
    }
    @Transactional
    public Memodto LoadMemo(Integer createorder){
        Memodel memodel = memorepo.findById(createorder).get();

        Memodto memodto = Memodto.builder()
                .createorder(memodel.getCreateorder())
                .title(memodel.getTitle())
                .description(memodel.getDescription())
                .build();
        return memodto;
    }

    @Transactional
    public void DeleteMemo(Integer createorder){
        memorepo.deleteById(createorder);
    }
}
