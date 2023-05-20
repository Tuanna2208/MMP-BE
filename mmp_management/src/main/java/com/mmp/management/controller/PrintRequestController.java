package com.mmp.management.controller;

import com.mmp.management.model.PrintRequest;
import com.mmp.management.repository.PrintRequestRepository;
import com.mmp.management.service.PrintRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/print-request")
public class PrintRequestController {
    @Autowired
    private PrintRequestService printRequestService;

    @GetMapping
    public List<PrintRequest> getAllPrintRequest() {
        return printRequestService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<PrintRequest> getPrintRequestById(@PathVariable(value = "id") long id) {
        return null;
    }
}
