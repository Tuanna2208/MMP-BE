package com.mmp.management.controller;

import com.mmp.management.common.dto.Response;
import com.mmp.management.common.utils.ResponseUtils;
import com.mmp.management.model.Asin;
import com.mmp.management.model.dto.AsinDto;
import com.mmp.management.service.impl.AsinService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/asin")
public class AsinController {
    @Autowired
    private AsinService asinService;

    @Autowired
    private ModelMapper modelMapper;

    @GetMapping
    public ResponseEntity<Response> getAllAsin() {
        List<Asin> asinList = asinService.findAll();
        List<AsinDto> asinDtoList = asinList.stream().map(asin -> modelMapper.map(asin, AsinDto.class)).collect(Collectors.toList());
        Response response = ResponseUtils.success(asinDtoList);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Response> getAsinById(@PathVariable(value = "id") long id) {
        Asin asin = asinService.findById(id);
        Response response;
        if (asin == null) {
            response = ResponseUtils.notFound("Asin ID not found");
        } else {
            AsinDto asinDto = modelMapper.map(asin, AsinDto.class);
            response = ResponseUtils.success(asinDto);
        }
        return ResponseEntity.ok(response);
    }
}
