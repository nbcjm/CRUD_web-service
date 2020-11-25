package com.zeronsoftn.cjm.memo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface Memorepo extends JpaRepository<Memodel, Integer> {
    public List<Memodel> findByTitle(String title);


}
