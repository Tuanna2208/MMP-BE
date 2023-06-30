package com.mmp.management.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AsinDto implements Serializable {
    private Integer id;
    private String asinCode;
    private Long productId;
}
