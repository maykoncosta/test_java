package com.ws.work.java.test.java.domain;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
@Entity
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Timestamp timestampRegistry;

    @ManyToOne
    @JoinColumn(name = "model_id")
    private Model model;

    private String fuel;
    private int numberDoors;
    private String color;
    private int year;

}
