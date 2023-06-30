package com.mmp.management.service.impl;

import com.mmp.management.common.exception.ResourceNotFound;
import com.mmp.management.model.Asin;
import com.mmp.management.repository.AsinRepository;
import com.mmp.management.service.IAsinInterface;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class AsinService implements IAsinInterface {
    @Autowired
    AsinRepository asinRepository;
    @Override
    public Asin save(Asin emp) {
        return asinRepository.save(emp);
    }
    @Override
    public Asin findById(Long id) {
        return asinRepository.findById(id).orElseThrow(() -> new ResourceNotFound("Not found Asin ID"));
    }
    @Override
    public List<Asin> findAll() {
        return asinRepository.findAll();
    }
    @Override
    public void remove(Long empId) {
        asinRepository.deleteById(empId);
    }
}
