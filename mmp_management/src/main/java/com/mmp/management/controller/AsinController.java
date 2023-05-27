package com.mmp.management.controller;

import com.mmp.management.model.Asin;
import com.mmp.management.service.AsinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/asin")
public class AsinController {
    @Autowired
    private AsinService asinService;

    @GetMapping
    public List<Asin> getAllAsin() {
        return asinService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Asin> getAsinById(@PathVariable(value = "id") long id) {
        return null;
    }
}
