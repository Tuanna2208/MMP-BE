package com.mmp.management.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "asin", schema="mmp")
public class Asin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "asin_code")
    private String asinCode;
    @Column(name = "product_id")
    private Long productId;
}
