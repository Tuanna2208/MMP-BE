package com.mmp.management.service;

import com.mmp.management.model.Asin;

import java.util.List;

public interface IAsinInterface {
    Asin save(Asin emp);

    Asin findById(Long id);

    List<Asin> findAll();

    void remove(Long empId);
}
