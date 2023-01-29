package com.ws.work.java.test.java.domain;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Model {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "brand_id")
    private Brand brand;

    private String name;
    private double fipeValue;
}
