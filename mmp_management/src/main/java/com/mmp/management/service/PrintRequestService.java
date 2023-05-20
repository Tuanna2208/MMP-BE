package com.mmp.management.service;

import com.mmp.management.model.PrintRequest;
import com.mmp.management.repository.PrintRequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PrintRequestService implements IPrintRequestInterface{
    @Autowired
    PrintRequestRepository printRequestRepository;
    @Override
    public PrintRequest save(PrintRequest emp) {
        return printRequestRepository.save(emp);
    }
    @Override
    public Optional<PrintRequest> findById(Long id) {
        return printRequestRepository.findById(id);
    }
    @Override
    public List<PrintRequest> findAll() {
        return printRequestRepository.findAll();
    }
    @Override
    public void remove(Long empId) {
        printRequestRepository.deleteById(empId);
    }
}
