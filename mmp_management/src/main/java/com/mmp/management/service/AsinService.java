package com.mmp.management.service;

import com.mmp.management.model.Asin;
import com.mmp.management.repository.AsinRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AsinService implements IPrintRequestInterface{
    @Autowired
    AsinRepository asinRepository;
    @Override
    public Asin save(Asin emp) {
        return asinRepository.save(emp);
    }
    @Override
    public Optional<Asin> findById(Long id) {
        return asinRepository.findById(id);
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
